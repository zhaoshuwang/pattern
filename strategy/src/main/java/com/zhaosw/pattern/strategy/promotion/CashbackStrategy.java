package com.zhaosw.pattern.strategy.promotion;

/**返现
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class CashbackStrategy implements PromotionStrategy
{
    public void doPromotion() {
        System.out.println("购买后返现金");
    }
}
