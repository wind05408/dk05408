package com.dp.factory;

import com.dp.enums.BizLineEnum;
import com.dp.constant.ProductConstant;
import com.dp.vo.PublishProductParam;
import com.dp.service.PublishProductService;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/24
 **/
public class PublishProductFactoryClient {

    public static void main(String[] args) {
        PublishProductParam publishProductParam = new PublishProductParam();

        publishProductParam.setBizLineEnum(BizLineEnum.HOTEL);
        publishProductParam.setBizType(ProductConstant.PRODUCT_BIZ_TYPE__NIB_HOTEL_BOOKING_DIRECT);
        publishProductParam.setProductId(1000L);
        publishProduct(publishProductParam);
    }

    public static void publishProduct(PublishProductParam publishProductParam) {

        //1.参数验证
        // validationPublishProductParam

        //2.产品验证
        //ProductService checkProduct()

        //3.产品发布
        PublishProductService publishProductService = PublishProductFactory.getPublishProductService(publishProductParam);
        publishProductService.publishProduct(publishProductParam);
    }


}
