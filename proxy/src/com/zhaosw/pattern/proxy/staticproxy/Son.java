package com.zhaosw.pattern.proxy.staticproxy;

import com.zhaosw.pattern.proxy.Person;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class Son implements Person{
    public void findLove(){
        System.out.println("儿子的要求：白富美");
    }
}
