package com.zhaosw.pattern.factory.abstractfactory;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class AbstractFacotryTest {
    public static void main(String[] args) {
        ICourseFactory factory=new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNode();
        factory.createVideo();
    }
}
