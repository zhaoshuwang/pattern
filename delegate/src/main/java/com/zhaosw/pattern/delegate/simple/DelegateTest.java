package com.zhaosw.pattern.delegate.simple;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("java",new Leader());
    }
}
