package com.zhaosw.pattern.proxy.dbroute.proxy;

import com.zhaosw.pattern.proxy.dbroute.db.DynamicDataSouceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private SimpleDateFormat sf = new SimpleDateFormat("yyyy");
    public Object target;
    public Object getInstance(Object target){
        this.target=target;
        Class<?> clazz=target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj=method.invoke(target, args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("after method");
        DynamicDataSouceEntity.restore();
    }

    private void before(Object object) {
        System.out.println("进行数据源切换，before method");
        try {
            Long time=(Long)object.getClass().getMethod("getCreateTime").invoke(object);
            String s=sf.format(new Date());
            Integer year=Integer.valueOf(s);
            System.out.println("动态代理类在【DB_"+year+"】上切换");
            DynamicDataSouceEntity.set(year);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
