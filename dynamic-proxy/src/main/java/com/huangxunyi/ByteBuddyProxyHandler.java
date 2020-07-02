package com.huangxunyi;

import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

import java.lang.reflect.Method;

public class ByteBuddyProxyHandler {
    private final Object delegate;

    public ByteBuddyProxyHandler(Object delegate) {
        this.delegate = delegate;
    }

    @SuppressWarnings("UnusedParameters")
    @RuntimeType
    public Object invoke(@Origin Method method, @AllArguments @RuntimeType Object[] args) throws Throwable {
        return method.invoke(delegate, args);
    }
}