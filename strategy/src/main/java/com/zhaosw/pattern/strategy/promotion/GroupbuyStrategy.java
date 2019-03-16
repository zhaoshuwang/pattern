package com.zhaosw.pattern.strategy.promotion;

/**团购拼团
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class GroupbuyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("20个人拼团购买");
    }
}
