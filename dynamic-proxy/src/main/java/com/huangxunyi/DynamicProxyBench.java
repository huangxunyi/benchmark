package com.huangxunyi;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import net.sf.cglib.proxy.Enhancer;
import org.openjdk.jmh.annotations.*;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;


@Fork(1)
@Warmup(iterations = 1)
@BenchmarkMode(Mode.Throughput)
@State(Scope.Thread)
@Threads(1)
@OutputTimeUnit(TimeUnit.SECONDS)
@Measurement(iterations = 2)
public class DynamicProxyBench {
    @Benchmark
    public void cglibDynamicProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setInterfaces(new Class[]{IFoo.class});
        enhancer.setCallback(new CglibInterceptor(new FooImpl()));
        IFoo foo = (IFoo) enhancer.create();
        String hello = foo.say("cglib");
    }

    @Benchmark
    public void bytebuddyDynamicProxy() {

        Class<IFoo> clazz = IFoo.class;
        Class<?> cls = new ByteBuddy()
                .subclass(clazz)
                .method(ElementMatchers.isDeclaredBy(clazz))
                .intercept(MethodDelegation.to(new ByteBuddyProxyHandler(new FooImpl()), "handler"))
                .make()
                .load(clazz.getClassLoader(), ClassLoadingStrategy.Default.INJECTION)
                .getLoaded();
    }

}
