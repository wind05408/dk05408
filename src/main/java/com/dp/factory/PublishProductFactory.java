package com.dp.factory;

import com.dp.enums.BizLineEnum;
import com.dp.constant.ProductConstant;
import com.dp.vo.PublishProductParam;
import com.dp.service.PublishProductService;
import com.dp.service.impl.*;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/24
 **/
public class PublishProductFactory {

    public static PublishProductService getPublishProductService(PublishProductParam publishProductParam) {
        if (BizLineEnum.HOTEL == publishProductParam.getBizLineEnum()) {
            if (ProductConstant.PRODUCT_BIZ_TYPE__NIB_HOTEL_BOOKING_DIRECT.equals(publishProductParam.getBizType())) {
                return new HotelBookingPublishProductServiceImpl();
            } else {
                return new HotelOtherPublishProductServiceImpl();
            }
        } else if (BizLineEnum.FOOD == publishProductParam.getBizLineEnum()) {
            if (ProductConstant.PRODUCT_BIZ_TYPE_MAIDAN.equals(publishProductParam.getBizType())) {
                return new FoodMaidanPublishProductServiceImpl();
            } else {
                return new FoodOtherPublishProductServiceImpl();
            }
        } else if (BizLineEnum.TRIP == publishProductParam.getBizLineEnum()) {
            return new TripPublishProductServiceImpl();
        } else {
            return new DefaultPublishProductServiceImpl();
        }
    }
}
