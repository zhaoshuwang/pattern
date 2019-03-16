package com.zhaosw.pattern.strategy.pay.payport;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 300;
    }
}
