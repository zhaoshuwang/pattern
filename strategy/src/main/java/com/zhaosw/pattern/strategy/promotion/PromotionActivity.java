package com.zhaosw.pattern.strategy.promotion;

/**促销活动
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;
    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy=promotionStrategy;
    }
    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
