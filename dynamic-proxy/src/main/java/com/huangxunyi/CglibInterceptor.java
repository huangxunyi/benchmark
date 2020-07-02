package com.huangxunyi;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibInterceptor implements MethodInterceptor {

    private final Object delegate;

    public CglibInterceptor(Object delegate) {
        this.delegate = delegate;
    }

    public Object intercept(Object object, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        return methodProxy.invoke(delegate, objects);
    }
}