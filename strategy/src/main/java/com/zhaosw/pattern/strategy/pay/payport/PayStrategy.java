package com.zhaosw.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class PayStrategy {
    public static final String ALIPAY = "ALIPAY";
    public static final String JDPAY = "JDPAY";
    public static final String WECHATPAY = "WECHATPAY";
    public static final String DEFAULTPAY = WECHATPAY;

    private static Map<String, Payment> payStrategyMap = new HashMap<String, Payment>();

    static {
        payStrategyMap.put(ALIPAY, new AliPay());
        payStrategyMap.put(JDPAY, new JDPay());
        payStrategyMap.put(WECHATPAY, new WechatPay());
    }

    public static Payment getPay(String payKey){
        if(!payStrategyMap.containsKey(payKey)){
            return payStrategyMap.get(DEFAULTPAY);
        }
        return payStrategyMap.get(payKey);
    }
}
