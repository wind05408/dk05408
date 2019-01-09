package com.spi.activate;

import com.alibaba.dubbo.common.extension.Activate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/9 10:15
 * Description:${TODO}
 */
@Activate(group = {"default_group"})
public class ActivateExt1Impl1 implements ActivateExt1 {
    @Override
    public String echo(String msg) {
        return msg;
    }
}
