package com.spi.activate;

import org.apache.dubbo.common.extension.SPI;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/9 10:15
 * Description:${TODO}
 */
@SPI
public interface ActivateExt1 {
    String echo(String msg);
}
