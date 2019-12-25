package com.dp;

import com.dp.constant.ProductConstant;
import com.dp.vo.PublishProductParam;
import com.dp.enums.BizLineEnum;

public class BadCodeDemoUpdate {

    public void publishProduct(PublishProductParam publishProductParam) {

        //参数验证
//        check entity

//        ProductService checkProduct()

        if (BizLineEnum.HOTEL == publishProductParam.getBizLineEnum()) {
            if (ProductConstant.PRODUCT_BIZ_TYPE__NIB_HOTEL_BOOKING_DIRECT.equals(publishProductParam.getBizType())) {
                //deal publish
                System.out.println("发布酒店直连商品");
            } else {
                //deal publish
                System.out.println("发布酒店其他商品");
            }
        } else if (BizLineEnum.FOOD == publishProductParam.getBizLineEnum()) {
            if (ProductConstant.PRODUCT_BIZ_TYPE_MAIDAN.equals(publishProductParam.getBizType())) {
                //deal publish
                System.out.println("发布到餐买单商品");
            } else {
                //deal publish
                System.out.println("发布餐饮其他商品");
            }
        } else if (BizLineEnum.TRIP == publishProductParam.getBizLineEnum()) {
            //deal publish
            System.out.println("发布度假商品");
        } else {
            //deal publish
            System.out.println("发布其他商品");
        }
    }

}