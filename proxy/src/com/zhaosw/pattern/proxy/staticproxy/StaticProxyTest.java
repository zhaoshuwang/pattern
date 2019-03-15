package com.zhaosw.pattern.proxy.staticproxy;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Mother mother=new Mother(new Son());
        mother.findLove();
    }
}
