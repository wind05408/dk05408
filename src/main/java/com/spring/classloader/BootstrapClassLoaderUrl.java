package com.spring.classloader;

import sun.misc.Launcher;

import java.net.URL;

/**
 * BootstrapClassLoaderUrl
 *
 * @author dk
 * @date 2016/8/12
 */
public class BootstrapClassLoaderUrl {
    public static void main(String[] args) {

        //Bootstrap classloader
//        URL[] urls= Launcher.getBootstrapClassPath().getURLs();
//        for (URL url:urls) {
//            System.out.println(url.toExternalForm());
//        }
/*        Console out:
        file:/D:/dev/java1.7/jre/lib/resources.jar
        file:/D:/dev/java1.7/jre/lib/rt.jar
        file:/D:/dev/java1.7/jre/lib/sunrsasign.jar
        file:/D:/dev/java1.7/jre/lib/jsse.jar
        file:/D:/dev/java1.7/jre/lib/jce.jar
        file:/D:/dev/java1.7/jre/lib/charsets.jar
        file:/D:/dev/java1.7/jre/lib/jfr.jar
        file:/D:/dev/java1.7/jre/classes*/

        //extension classloader
//        System.out.println(System.getProperty("java.ext.dirs"));
//        ClassLoader extensionClassloader=ClassLoader.getSystemClassLoader().getParent();
//        System.out.println("the parent of extension classloader : "+extensionClassloader.getParent());

//        System.out.println(System.getProperty("java.class.path"));

        System.out.println("the Launcher's classloader is "+sun.misc.Launcher.getLauncher().getClass().getClassLoader());

    }
}
