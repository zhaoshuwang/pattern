package com.zhaosw.pattern.factory.abstractfactory;

import com.zhaosw.pattern.factory.ICourse;

/** 抽象工厂
 * 不符合开闭原则，要慎用，但是易扩展
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public interface ICourseFactory {
    ICourse createCourse();
    INode createNode();
    IVideo createVideo();
}
