package com.dp.service.impl;

import com.dp.vo.PublishProductParam;
import com.dp.service.PublishProductService;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/24
 **/
public class FoodMaidanPublishProductServiceImpl implements PublishProductService {
    @Override
    public void publishProduct(PublishProductParam publishProductParam) {
        System.out.println("发布到餐买单商品");
    }
}
