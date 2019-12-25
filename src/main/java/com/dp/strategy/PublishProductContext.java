package com.dp.strategy;

import com.dp.vo.PublishProductParam;
import com.dp.service.PublishProductService;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/24
 **/
public class PublishProductContext {
    private PublishProductService publishProductService;

    /**
     * 传进的是一个具体的策略实例
     */
    public PublishProductContext(PublishProductService publishProductService) {
        this.publishProductService = publishProductService;
    }

    /**
     * 调用策略
     */
    public void publishProduct(PublishProductParam publishProductParam) {
        publishProductService.publishProduct(publishProductParam);
    }

}
