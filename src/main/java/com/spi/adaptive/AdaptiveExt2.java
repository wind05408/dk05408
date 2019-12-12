package com.spi.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/8 20:12
 * Description:${TODO}
 */
@SPI("dubbo")
public interface AdaptiveExt2 {

    @Adaptive({"t"})
    String echo(String msg, URL url);
}
