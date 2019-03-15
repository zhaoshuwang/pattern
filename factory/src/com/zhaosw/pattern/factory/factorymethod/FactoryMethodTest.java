package com.zhaosw.pattern.factory.factorymethod;

import com.zhaosw.pattern.factory.ICourse;
import com.zhaosw.pattern.factory.JavaCourse;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory=new JavaCourseFactory();
        ICourse course =factory.create();
        course.record();

        factory=new CCourseFactory();
        course=factory.create();
        course.record();

    }
}
