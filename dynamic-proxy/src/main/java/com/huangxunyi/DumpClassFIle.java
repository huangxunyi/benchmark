package com.huangxunyi;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

import java.io.File;
import java.io.IOException;

public class DumpClassFIle {

    private void cglibGenerateClass() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "dynamic-proxy/target/cglib");
        long start = System.currentTimeMillis();
        Enhancer enhancer = new Enhancer();
        enhancer.setInterfaces(new Class[]{IFoo.class});
        enhancer.setCallback(new CglibInterceptor(new FooImpl()));
        IFoo foo = (IFoo) enhancer.create();
        System.out.println(" cglib cost -> " + (System.currentTimeMillis() - start));
        String hello = foo.say("cglib");
        System.out.println("cglib classes save in " + new File("dynamic-proxy/target/cglib/").getAbsolutePath());
    }

    private void bytebuddyGenerateClass() throws IOException {
        File file = new File("dynamic-proxy/target/bytebuddy");
        long start = System.currentTimeMillis();
        new ByteBuddy()
                .subclass(IFoo.class)
                .method(ElementMatchers.isDeclaredBy(IFoo.class))
                .intercept(MethodDelegation.to(new ByteBuddyProxyHandler(new FooImpl()), "handler"))
                .make().saveIn(file);
        System.out.println(" bytebuddy cost -> " + (System.currentTimeMillis() - start));
        System.out.println("bytebuddy classes save in " + new File("dynamic-proxy/target/bytebuddy/").getAbsolutePath());
    }

    public static void main(String[] args) throws IOException {
        DumpClassFIle dump = new DumpClassFIle();
        dump.bytebuddyGenerateClass();
        dump.cglibGenerateClass();
    }
}
