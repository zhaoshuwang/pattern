package com.zhaosw.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class ConCreatePrototypy implements Prototype {
    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConCreatePrototypy conCreatePrototypy=new ConCreatePrototypy();
        conCreatePrototypy.setAge(this.age);
        conCreatePrototypy.setName(this.name);
        conCreatePrototypy.setHobbies(this.hobbies);
        return conCreatePrototypy;
    }
}
