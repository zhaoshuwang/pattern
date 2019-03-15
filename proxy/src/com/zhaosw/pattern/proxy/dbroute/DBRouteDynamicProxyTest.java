package com.zhaosw.pattern.proxy.dbroute;

import com.zhaosw.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.zhaosw.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class DBRouteDynamicProxyTest {
    public static void main(String[] args) {
        Order order=new Order();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date= simpleDateFormat.parse("2019-03-15");
            order.setCreateTime(date.getTime());

            IOrderService orderService=(IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
