package com.zhaosw.pattern.factory;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class JavaCourse implements ICourse{


    @Override
    public void record() {
        System.out.println("学习java课程");
    }
}
