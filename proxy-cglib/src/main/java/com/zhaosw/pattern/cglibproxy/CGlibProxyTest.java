package com.zhaosw.pattern.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * jdk是读取接口的信息，cglib是覆盖父类的方法，目的都是生成一个新的类来增加代码的逻辑
 * jkdProxy必须有一个接口，cglib可以是任意一个类
 * jdkProxy生成代理的逻辑简单，但每次都要反射动态调用，执行效率低
 * cglib生成代理逻辑复杂，生成一个包含所有逻辑的Fastclass，不需要反射，调用效率高
 * cglib不能代理final的方法
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class CGlibProxyTest {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://java/idea/pattern/proxy-cglib/src/main/cglib/");
        Customer customer=(Customer)new CglibMeipo().getInstance(Customer.class);
        System.out.println(customer);
        customer.findLove();
    }
}
