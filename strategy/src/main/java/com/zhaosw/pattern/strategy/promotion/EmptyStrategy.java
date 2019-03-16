package com.zhaosw.pattern.strategy.promotion;

/**无优惠
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class EmptyStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("原价无优惠");
    }
}
