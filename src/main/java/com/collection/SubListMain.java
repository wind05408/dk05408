package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/7/23 16:52
 * Description:${TODO}
 */
public class SubListMain {
    public static void main(String[] args) {
//        subList1();
        subList2();
    }

    public static void subList1(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>(list1);

        List<Integer> list3 = list1.subList(0,list1.size());

        list3.add(3);
        System.out.println("list1 == list2:"+list1.equals(list2));
        System.out.println("list1 == list3:"+list1.equals(list3));
    }

    public static void subList2(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list3 = list1.subList(0,list1.size());
        list1 = Collections.unmodifiableList(list1);

        //list1.subList(100,200).clear();

        list1.add(3);
        System.out.println("list1.size:"+list1.size());
        System.out.println("list3.size:"+list3.size());
    }
}
