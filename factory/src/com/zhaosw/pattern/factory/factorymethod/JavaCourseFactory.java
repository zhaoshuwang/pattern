package com.zhaosw.pattern.factory.factorymethod;

import com.zhaosw.pattern.factory.ICourse;
import com.zhaosw.pattern.factory.JavaCourse;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
