package com.zhaosw.pattern.proxy.dbroute.proxy;

import com.zhaosw.pattern.proxy.dbroute.IOrderService;
import com.zhaosw.pattern.proxy.dbroute.Order;
import com.zhaosw.pattern.proxy.dbroute.OrderService;
import com.zhaosw.pattern.proxy.dbroute.db.DynamicDataSouceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class OrderServiceStaticProxy implements IOrderService{
    private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy");
    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService=orderService;
    }
    @Override
    public int createOrder(Order order) {
        Long time =order.getCreateTime();
        String date=simpleDateFormat.format(new Date(time));
        Integer year=Integer.valueOf(date);
        System.out.println("静态代理类分配到【DB_"+year+"】数据源");
        DynamicDataSouceEntity.set(year);
        this.orderService.createOrder(order);
        DynamicDataSouceEntity.restore();
        return 0;
    }
}
