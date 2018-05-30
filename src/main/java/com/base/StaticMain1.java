package com.base;

/**
 * @author: dk05408
 * @date: 2018/5/30 15:37
 * Description:
 */
public class StaticMain1 {
    static{     // 在主方法所在的类中定义静态块
        System.out.println("在主方法所在类中定义的代码块") ;
    }
    public static void main(String args[]){
        new Demo() ;        // 实例化对象
        new Demo() ;        // 实例化对象
        new Demo() ;        // 实例化对象
    }
}

class Demo{
    {   // 直接在类中编写代码块，称为构造块
        System.out.println("1、构造块。") ;
    }
    static{ // 使用static，称为静态代码块
        System.out.println("0、静态代码块") ;
    }
    public Demo(){  // 定义构造方法
        System.out.println("2、构造方法。") ;
    }
};
