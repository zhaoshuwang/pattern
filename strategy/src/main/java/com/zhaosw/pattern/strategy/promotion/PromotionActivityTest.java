package com.zhaosw.pattern.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class PromotionActivityTest {
    /*public static void main(String[] args) {

        PromotionActivity jd1111=new PromotionActivity(new CouponStrategy());
        jd1111.execute();
    }*/

    /*public static void main(String[] args) {
        PromotionActivity promotionActivity=null;
        String activity="COUPON";

        if (StringUtils.equals(activity, "COUPON")) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else if(StringUtils.equals(activity,"CASHBACK")){
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }
        promotionActivity.execute();
    }*/

    public static void main(String[] args) {
        String activity="COUPON";
        PromotionStrategy promotionStrategy=PromotionStrategyFactory.getPromotionStrategy(activity);
        PromotionActivity promotionActivity = new PromotionActivity(promotionStrategy);
        promotionActivity.execute();
    }
}
