package com.spi.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/3/21 17:31
 * Description:${TODO}
 */
public class DubboSPITest {

    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }

}
