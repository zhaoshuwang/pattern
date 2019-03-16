package com.zhaosw.pattern.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        //代理工具类 相当于Proxy
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }

    public void before(){
        System.out.println("媒婆帮你找对象，你的要求告诉我");
        System.out.println("我给你物色");
    }
    public void after(){
        System.out.println("物色好了，你们谈");
    }
}
