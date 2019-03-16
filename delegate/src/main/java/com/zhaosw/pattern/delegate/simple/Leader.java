package com.zhaosw.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class Leader {
    //预先知道每个人的特长
    private Map<String,IWorker> map=new HashMap<String, IWorker>();
    public Leader(){
        map.put("java",new WorkerA());
        map.put("python", new WorkerB());
    }

    public void work(String command){
        map.get(command).work(command);
    }
}
