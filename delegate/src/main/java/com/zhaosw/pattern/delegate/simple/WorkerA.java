package com.zhaosw.pattern.delegate.simple;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class WorkerA implements IWorker {
    @Override
    public void work(String command) {
        System.out.println("我是A，我在做"+command);
    }
}
