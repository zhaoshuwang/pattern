package com.zhaosw.pattern.delegate.simple;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class WorkerB implements IWorker {
    @Override
    public void work(String command) {
        System.out.println("我是B，我在做"+command);
    }
}
