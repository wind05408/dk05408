package com.spi.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/8 20:12
 * Description:${TODO}
 */
@Adaptive
public class ThriftAdaptiveExt2 implements AdaptiveExt2 {
    @Override
    public String echo(String msg, URL url) {
        return "thrift";
    }
}