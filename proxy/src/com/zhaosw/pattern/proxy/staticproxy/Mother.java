package com.zhaosw.pattern.proxy.staticproxy;

import com.zhaosw.pattern.proxy.Person;

/** 静态代理
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class Mother implements Person{
    private Son son;
    public Mother(Son son){
        this.son=son;
    }
    public void findLove(){
        System.out.println("老妈物色对象");
        this.son.findLove();
        System.out.println("很满意");
    }
}
