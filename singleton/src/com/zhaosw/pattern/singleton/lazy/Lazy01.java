package com.zhaosw.pattern.singleton.lazy;

/**懒汉式单例
 * 在外部调用时才会实例化
 * Created by zhaoshuwang on 2019-03-14 0014.
 */
public class Lazy01 {
    private Lazy01(){}
    private static Lazy01 lazy=null;

    public static Lazy01 getInstance() {
        if (lazy == null){
            //两个线程都可以进来
            lazy = new Lazy01();
        }
        return lazy;
    }
}
