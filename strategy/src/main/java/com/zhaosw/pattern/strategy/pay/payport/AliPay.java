package com.zhaosw.pattern.strategy.pay.payport;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 1000;
    }
}
