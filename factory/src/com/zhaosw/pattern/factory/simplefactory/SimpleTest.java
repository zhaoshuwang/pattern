package com.zhaosw.pattern.factory.simplefactory;

import com.zhaosw.pattern.factory.ICourse;
import com.zhaosw.pattern.factory.JavaCourse;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class SimpleTest {
    public static void main(String[] args) {
        SimpleFactory factory=new SimpleFactory();
        /*ICourse course=factory.create("java");
        course.record();*/

        /*ICourse course=factory.create("com.zhaosw.pattern.factory.JavaCourse");
        course.record();*/

        ICourse course=factory.create(JavaCourse.class);
        course.record();
    }
}
