package com.zhaosw.pattern.factory;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class CCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("学习C语言");
    }
}
