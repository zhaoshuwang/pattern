package com.zhaosw.pattern.singleton.hungry;

/**
 * 饿汉式单例
 * 线程安全，在线程还没出现之前就已经实例化
 * Created by zhaoshuwang on 2019-03-14 0014.
 */
public class Hungry {
    private Hungry(){}
    private static final Hungry hungry=new Hungry();

    public static Hungry getInstance() {
        return hungry;

    }
}
