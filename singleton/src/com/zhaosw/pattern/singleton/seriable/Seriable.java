package com.zhaosw.pattern.singleton.seriable;

import java.io.Serializable;

/**序列化
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class Seriable implements Serializable {
    private Seriable(){}
    private static final Seriable instance=new Seriable();

    public static Seriable getInstance(){
        return instance;
    }

    //重新readResolve方法，只不过覆盖了反序列化出来的对象
    private Object readResolve(){
        return instance;
    }
}
