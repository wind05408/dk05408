package com.dp.strategy;

import com.dp.enums.BizLineEnum;
import com.dp.constant.ProductConstant;
import com.dp.vo.PublishProductParam;
import com.dp.service.impl.HotelBookingPublishProductServiceImpl;
import com.dp.service.PublishProductService;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/24
 **/
public class PublishProductStrategyClient {
    public static void main(String[] args) {
        PublishProductParam publishProductParam = new PublishProductParam();

        publishProductParam.setBizLineEnum(BizLineEnum.HOTEL);
        publishProductParam.setBizType(ProductConstant.PRODUCT_BIZ_TYPE__NIB_HOTEL_BOOKING_DIRECT);
        publishProductParam.setProductId(1000L);
        publishProduct(publishProductParam,new HotelBookingPublishProductServiceImpl());
    }

    public static void publishProduct(PublishProductParam publishProductParam,PublishProductService publishProductService) {

        //1.参数验证
        // validationPublishProductParam

        //2.产品验证
        //ProductService checkProduct()

        //3.产品发布
        PublishProductContext publishProductContext = new PublishProductContext(publishProductService);
        publishProductContext.publishProduct(publishProductParam);
    }

    public void validationPublishProductParam(PublishProductParam publishProductParam){
        //参数验证
    }


}
