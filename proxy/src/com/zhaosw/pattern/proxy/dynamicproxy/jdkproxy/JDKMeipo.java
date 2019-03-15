package com.zhaosw.pattern.proxy.dynamicproxy.jdkproxy;

import com.zhaosw.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class JDKMeipo implements InvocationHandler{
    private Person target;
    public Object getInstance(Person person){
        this.target=person;
        Class<?> clazz=target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o=method.invoke(this.target, args);
        after();
        return o;
    }

    public void before(){
        System.out.println("媒婆帮你找对象，你的要求告诉我");
        System.out.println("我给你物色");
    }
    public void after(){
        System.out.println("物色好了，你们谈");
    }
}
