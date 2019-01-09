package com.spi.activate;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/1/9 10:30
 * Description:dubbo spi @activate的运用
 * 底层框架SPI提供者通过{@link com.alibaba.dubbo.common.extension.ExtensionLoader}的{@link ExtensionLoader#getActivateExtension}方法
 * 获得条件的扩展。
 * @see com.alibaba.dubbo.common.extension.Activate
 * @version dubbo 2.5.6
 */
public class ActivateMain {

    public static void main(String[] args) {
//        testDefault();
        test2();
//        testValue();
//        testOrder();
    }

    public static void testDefault() {
        ExtensionLoader<ActivateExt1> loader = ExtensionLoader.getExtensionLoader(ActivateExt1.class);
        URL url = URL.valueOf("test://localhost/test");
        //查询组为default_group的ActivateExt1的实现
        List<ActivateExt1> list = loader.getActivateExtension(url, new String[]{}, "default_group");
        System.out.println(list.size());
        System.out.println(list.get(0).getClass());
    }

    public static void test2() {
        URL url = URL.valueOf("test://localhost/test");
        //查询组为group2的ActivateExt1的实现
        List<ActivateExt1> list = ExtensionLoader.getExtensionLoader(ActivateExt1.class).getActivateExtension(url, new String[]{}, "group2");
        System.out.println(list.size());
        System.out.println(list.get(0).getClass());
    }

    public static void testValue() {
        URL url = URL.valueOf("test://localhost/test");
        //根据   key = value1,group =  value
        //@Activate(value = {"value1"}, group = {"value"})来激活扩展
        url = url.addParameter("value1", "value");
        List<ActivateExt1> list = ExtensionLoader.getExtensionLoader(ActivateExt1.class).getActivateExtension(url, new String[]{}, "value");
        System.out.println(list.size());
        System.out.println(list.get(0).getClass());
    }

    public static void testOrder() {
        URL url = URL.valueOf("test://localhost/test");
        List<ActivateExt1> list = ExtensionLoader.getExtensionLoader(ActivateExt1.class).getActivateExtension(url, new String[]{}, "order");
        System.out.println(list.size());
        System.out.println(list.get(0).getClass());
        System.out.println(list.get(1).getClass());
    }


}
