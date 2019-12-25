package com.dp;

import com.dp.enums.BizLineEnum;

public class BadCodeDemo {

    public void publishProduct(BizLineEnum bizLineEnum, String bizType, Long productId){
        if (BizLineEnum.HOTEL == bizLineEnum && bizType.equals("nib.hotel.booking.direct")){
            //get productById
            //check product
            //deal publish
            System.out.println("发布酒店直连商品");
        }else if(BizLineEnum.HOTEL == bizLineEnum){
            //get productById
            //check product
            //deal publish
            System.out.println("发布酒店其他商品");
        }else if (BizLineEnum.FOOD == bizLineEnum && bizType.equals("maidan")){
            //get productById
            //check product
            //deal publish
            System.out.println("发布到餐买单商品");
        }else if(BizLineEnum.FOOD == bizLineEnum){
            //get productById
            //check product
            //deal publish
            System.out.println("发布餐饮其他商品");
        }else if (BizLineEnum.TRIP == bizLineEnum){
            //get productById
            //check product
            //deal publish
            System.out.println("发布度假商品");
        }else {
            //get productById
            //check product
            //deal publish
            System.out.println("发布其他商品");
        }
    }

}