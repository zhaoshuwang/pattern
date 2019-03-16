package com.zhaosw.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**工厂
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class PromotionStrategyFactory {
    private PromotionStrategyFactory(){}

    private static Map<String,PromotionStrategy> map=new HashMap<String, PromotionStrategy>();

    static {
        map.put(StrategyKey.COUPON, new CouponStrategy());
        map.put(StrategyKey.CASHBACK, new CashbackStrategy());
        map.put(StrategyKey.GROUPBUY, new GroupbuyStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String strategyKey){
        PromotionStrategy promotionStrategy = map.get(strategyKey);
        return promotionStrategy==null? new EmptyStrategy():promotionStrategy;
    }

    private interface StrategyKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
