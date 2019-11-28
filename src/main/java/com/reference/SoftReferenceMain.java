package com.reference;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/11/28
 * 当设置jvm 运行参数为 -Xms1m -Xmx1m
 * 软引用只会在内存不足的情况下才会进行回收，如果内存充足，则不回收
 **/
public class SoftReferenceMain {
    public static void main(String[] args) {
        //定义一个软引用列表
        List<SoftReference<Integer>> softList = new ArrayList<>();

        for(int i=0;i<10000;i++){
            softList.add(new SoftReference<Integer>(new Integer(i)));
        }
        //存活的引用数
        int activeRefNum = 0;
        for(SoftReference softRef:softList){
            if(softRef.get()!=null){
                activeRefNum++;
            }
        }

        System.out.println("当前存活的引用数："+activeRefNum);

        List list = new ArrayList();
        for(int i=0;i<10000;i++){
            list.add(i);
        }

        activeRefNum = 0;
        for(SoftReference softRef:softList){
            if(softRef.get()!=null){
                activeRefNum++;
            }
        }

        System.out.println("当前存活的引用数："+activeRefNum);
    }
}
