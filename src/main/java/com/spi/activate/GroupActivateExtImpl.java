package com.spi.activate;

import com.alibaba.dubbo.common.extension.Activate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/9 10:24
 * Description:${TODO}
 */
@Activate(group = {"group1", "group2"})
public class GroupActivateExtImpl implements ActivateExt1 {
    @Override
    public String echo(String msg) {
        return msg;
    }
}
