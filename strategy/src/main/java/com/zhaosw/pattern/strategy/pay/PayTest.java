package com.zhaosw.pattern.strategy.pay;

import com.zhaosw.pattern.strategy.pay.payport.PayStrategy;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class PayTest {
    public static void main(String[] args) {
        Order order=new Order("1","20190001",356.09);
        order.pay(PayStrategy.ALIPAY);
    }
}
