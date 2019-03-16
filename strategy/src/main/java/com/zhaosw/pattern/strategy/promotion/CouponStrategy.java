package com.zhaosw.pattern.strategy.promotion;

/**优惠券
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class CouponStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("优惠券进行相应的抵扣");
    }
}
