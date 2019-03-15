package com.zhaosw.pattern.prototype.simple;

import java.util.ArrayList;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class SimplePrototypeTest {
    public static void main(String[] args) {
        ConCreatePrototypy conCreatePrototypy=new ConCreatePrototypy();
        conCreatePrototypy.setAge(20);
        conCreatePrototypy.setName("zhaosw");
        conCreatePrototypy.setHobbies(new ArrayList());

        ConCreatePrototypy copy=(ConCreatePrototypy)conCreatePrototypy.clone();

        System.out.println("克隆对象的引用地址的值："+copy.getHobbies());
        System.out.println("原对象的引用地址的值："+conCreatePrototypy.getHobbies());
        System.out.println(copy.getHobbies()==conCreatePrototypy.getHobbies());

    }
}
