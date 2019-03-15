package com.zhaosw.pattern.factory.abstractfactory;

import com.zhaosw.pattern.factory.ICourse;
import com.zhaosw.pattern.factory.JavaCourse;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INode createNode() {
        return new JavaNode();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
