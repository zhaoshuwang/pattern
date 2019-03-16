package com.zhaosw.pattern.strategy.pay;

import com.zhaosw.pattern.strategy.pay.payport.PayStrategy;
import com.zhaosw.pattern.strategy.pay.payport.Payment;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class Order {
    private String uid;
    private String orderId;
    private double account;

    public Order(String uid, String orderId, double account) {
        this.uid = uid;
        this.orderId = orderId;
        this.account = account;
    }

    public MsgResult pay(String paykey){
        Payment payment=PayStrategy.getPay(paykey);
        System.out.println(payment.getName());
        System.out.println("交易金额："+account);

        return payment.pay(uid,account);
    }
}
