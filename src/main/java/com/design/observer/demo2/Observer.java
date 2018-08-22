package com.design.observer.demo2;


/**
 * Created by dk05408 on 2016/11/29.
 */
public interface Observer {
    /**
     * 更新接口
     * @param subject 传入主题对象，方面获取相应的主题对象的状态
     */
    void update(Subject subject);
}