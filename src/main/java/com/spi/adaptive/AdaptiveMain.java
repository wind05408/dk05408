package com.spi.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

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
//        test3();
        test4();
    }

    public static void test1() {
        ExtensionLoader<AdaptiveExt2> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
        AdaptiveExt2 adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test");
        System.out.println(adaptiveExtension.echo("d", url));
    }

    public static void test2() {
        //SPI注解中有value值，URL中也有具体的值
        ExtensionLoader<AdaptiveExt2> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
        AdaptiveExt2 adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?adaptive.ext2=cloud");//spring cloud
        System.out.println(adaptiveExtension.echo("d", url));
    }

    public static void test3() {
        ExtensionLoader<AdaptiveExt2> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
//        @Adaptive
//        public class ThriftAdaptiveExt2 即在ThriftAdaptiveExt2添加@Adaptive
        AdaptiveExt2 adaptiveExtension = loader.getAdaptiveExtension();
//        SPI注解中有value值，URL中也有具体的值,实现类上有@Adaptive注解
        URL url = URL.valueOf("test://localhost/test?adaptive.ext2=cloud");//thrift
        System.out.println(adaptiveExtension.echo("d", url));
    }

    public static void test4() {
        ExtensionLoader<AdaptiveExt2> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
        AdaptiveExt2 adaptiveExtension = loader.getAdaptiveExtension();
        //@Adaptive({"t"})
        //在方法上打上@Adaptive注解，注解中的value与链接中的参数的key一致，链接中的key对应的value就是spi中的name,获取相应的实现类。
        URL url = URL.valueOf("test://localhost/test?t=cloud");//spring cloud
//        URL url = URL.valueOf("test://localhost/test?tt=cloud");//dubbo default
        System.out.println(adaptiveExtension.echo("d", url));
    }
}
