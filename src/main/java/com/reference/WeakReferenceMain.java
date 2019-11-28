package com.reference;

import java.lang.ref.WeakReference;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/11/28
 * 相对与强引用来说，弱引用在gc阶段，引用所指向的对象将被强制的回收
 **/
public class WeakReferenceMain {
    public static void main(String[] args) {
        WeakReference<Integer> weakRef = new WeakReference(128);
        System.out.println("GC前："+weakRef.get());
        System.gc();
        System.out.println("GC后："+weakRef.get());
    }
}
