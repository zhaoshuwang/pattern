package com.zhaosw.pattern.proxy.dbroute;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("插入订单成功！！");
        return 1;
    }
}
