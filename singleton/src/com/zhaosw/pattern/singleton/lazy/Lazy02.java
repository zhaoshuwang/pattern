package com.zhaosw.pattern.singleton.lazy;

/**懒汉式单例
 * 方法上加锁
 * Created by zhaoshuwang on 2019-03-14 0014.
 */
public class Lazy02 {
    private Lazy02(){};
    private static Lazy02 lazy = null;

    public static synchronized Lazy02 getInstance(){
        if(lazy == null) {
            lazy = new Lazy02();
        }
        return lazy;
    }

}
