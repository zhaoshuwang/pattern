package com.zhaosw.pattern.strategy.pay.payport;

import com.zhaosw.pattern.strategy.pay.MsgResult;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public abstract class Payment {
    public abstract String getName();
    protected abstract double queryBalance(String uid);
    public MsgResult pay(String uid,double amount){
        if(queryBalance(uid)<amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200, "支付成功", "金额" + amount);
    }

}
