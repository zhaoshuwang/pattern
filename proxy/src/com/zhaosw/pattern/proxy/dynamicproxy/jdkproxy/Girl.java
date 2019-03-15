package com.zhaosw.pattern.proxy.dynamicproxy.jdkproxy;

import com.zhaosw.pattern.proxy.Person;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
    }
}
