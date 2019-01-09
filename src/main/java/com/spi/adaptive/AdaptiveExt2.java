package com.spi.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/8 20:12
 * Description:${TODO}
 */
@SPI("dubbo")
public interface AdaptiveExt2 {
    @Adaptive
    String echo(String msg, URL url);
}
