package com.spring.classloader;

/**
 * ClassLoaderTest
 *
 * @author dk
 * @date 2016/8/12
 *  system classloader[AppClassLoader]
 *  extension classloader[ExtClassLoader]
 *  bootstrap classloader[BootClassLoader]
 *
 *  当前的ClassLoader是AppClassLoader，父ClassLoader是ExtClassLoader，祖父ClassLoader是根类装载器BootClassLoader
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:"+loader);//AppClassLoader-->system classloader
        System.out.println("parent loader:"+loader.getParent());//ExtClassLoader-->extension classloader
        System.out.println("grandparent loader:"+loader.getParent(). getParent());//BootClassLoader --> bootstrap classloader
        /*
        out:
        current loader:sun.misc.Launcher$AppClassLoader@2994363b
        parent loader:sun.misc.Launcher$ExtClassLoader@417470d0
        grandparent loader:null


        当前的ClassLoader是AppClassLoader，
        父ClassLoader是ExtClassLoader，
        祖父ClassLoader是根类装载器，因为在Java中无法获得它的句柄，所以仅返回null
        */

    }
}