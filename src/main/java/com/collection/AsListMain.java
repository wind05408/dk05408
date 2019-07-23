package com.collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/7/23 16:16
 * Description:${TODO}
 */
public class AsListMain {
    public static void main(String[] args) {
//        intAsList();
//        integerAsList();
        integerAsList2();
    }


    public static void integerAsList(){
        Integer[] array ={1,2,3,4,5};
        List list = Arrays.asList(array);
        System.out.println("list.size="+list.size());
        System.out.println("list类型="+list.getClass()+"      "+list.get(0).getClass());
        System.out.println("list..get(0)==array:"+list.get(0).equals(array));
    }

    public static void intAsList(){
        int[] array ={1,2,3,4,5};
        List list = Arrays.asList(array);
        System.out.println("list.size="+list.size());
        System.out.println("list类型="+list.getClass()+"      "+list.get(0).getClass());
        System.out.println("list..get(0)==array:"+list.get(0).equals(array));
    }

    public static void integerAsList2(){
        Integer[] array ={1,2,3,4,5};
        List list = Arrays.asList(array);
        list.add(10);
        System.out.println("list.size="+list.size());
        System.out.println("list类型="+list.getClass()+"      "+list.get(0).getClass());
        System.out.println("list..get(0)==array:"+list.get(0).equals(array));
    }

}
