package com.zhaosw.pattern.factory.factorymethod;

import com.zhaosw.pattern.factory.CCourse;
import com.zhaosw.pattern.factory.ICourse;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class CCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {

        return new CCourse();
    }
}
