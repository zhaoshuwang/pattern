package com.zhaosw.pattern.delegate.simple;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class Boss {
    public void command(String command,Leader leader){
        leader.work(command);
    }
}
