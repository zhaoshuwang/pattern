package com.zhaosw.pattern.prototype.deep;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class DeepTest {
    public static void main(String[] args) {
        SunWuKong sunWuKong=new SunWuKong();
        try {
            SunWuKong copy=(SunWuKong)sunWuKong.clone();
            System.out.println("深克隆:"+(sunWuKong.jinGuBang==copy.jinGuBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
