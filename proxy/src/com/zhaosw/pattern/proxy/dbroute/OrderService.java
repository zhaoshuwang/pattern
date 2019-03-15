package com.zhaosw.pattern.proxy.dbroute;

/**
 * Created by zhaoshuwang on 2019-03-15 0015.
 */
public class OrderService implements IOrderService{
    private OrderDao orderDao;
    public OrderService(){
        this.orderDao=new OrderDao();
    }
    public int createOrder(Order order){
        System.out.println("service调用dao成功创建订单");
        return orderDao.insert(order);
    }
}
