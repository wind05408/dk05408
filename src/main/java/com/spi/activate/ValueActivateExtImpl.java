package com.spi.activate;

import com.alibaba.dubbo.common.extension.Activate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/9 10:24
 * Description:${TODO}
 */
@Activate(group = {"value"},value = {"value1"})
public class ValueActivateExtImpl implements ActivateExt1 {
    @Override
    public String echo(String msg) {
        return msg;
    }
}
