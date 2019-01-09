package com.spi.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/8 20:21
 * Description:dubbo spi Adaptive
 * 在{@link ExtensionLoader}生成Extension的Adaptive Instance时，为{@link ExtensionLoader}提供信息。
 * @see com.alibaba.dubbo.common.extension.Adaptive
 * @version dubbo 2.5.6
 */
public class AdaptiveMain {
    public static void main(String[] args) {
//       test1();
//       test2();
        test3();
    }

    public static void test1() {
        ExtensionLoader<AdaptiveExt2> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
        AdaptiveExt2 adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test");
        System.out.println(adaptiveExtension.echo("d", url));
    }

    public static void test2() {
        ExtensionLoader<AdaptiveExt2> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
        AdaptiveExt2 adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?adaptive.ext2=cloud");
        System.out.println(adaptiveExtension.echo("d", url));
    }

    public static void test3() {
        ExtensionLoader<AdaptiveExt2> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
        AdaptiveExt2 adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?adaptive.ext2=cloud");
        System.out.println(adaptiveExtension.echo("d", url));
    }
}
