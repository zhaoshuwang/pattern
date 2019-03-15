package com.zhaosw.pattern.proxy.dynamicproxy.jdkproxy;

import com.zhaosw.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class JDKProxyTest {
    public static void main(String[] args)  {
        Person person=(Person)new JDKMeipo().getInstance(new Girl());
        person.findLove();
        /*Object obj=new JDKMeipo().getInstance(new Girl());
        try {
            Method m=obj.getClass().getMethod("findLove", null);
            m.invoke(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/

        //$Proxy0
        byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        try {
            FileOutputStream fos=new FileOutputStream("E://java/idea/pattern/proxy/target/$Proxy0.class");
            fos.write(bytes);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
