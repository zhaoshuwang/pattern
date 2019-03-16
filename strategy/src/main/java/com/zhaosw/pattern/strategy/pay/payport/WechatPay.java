package com.zhaosw.pattern.strategy.pay.payport;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
