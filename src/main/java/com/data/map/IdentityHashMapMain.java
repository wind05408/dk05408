package com.data.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @author: dk05408
 * @date: 2018/12/3 13:45
 * Description:
 */
public class IdentityHashMapMain {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("a", "2");
        map.put("a", "3");
        System.out.println(map.size()); //1

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(new String("a"), "1");
        hashMap.put(new String("a"), "2");
        hashMap.put(new String("a"), "3");
        System.out.println(hashMap.size()); //1

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(new Integer(200), "1");
        hashMap2.put(new Integer(200), "2");
        hashMap2.put(new Integer(200), "3");
        System.out.println(hashMap2.size()); //1

        Map<IdentityHashMapDemo, String> hashMap3 = new HashMap<>();
        hashMap3.put(new IdentityHashMapDemo(1), "1");
        hashMap3.put(new IdentityHashMapDemo(1), "2");
        hashMap3.put(new IdentityHashMapDemo(1), "3");
        System.out.println(hashMap3.size()); //3

        /********************************HashMap******************************/
        //IdentityHashMap使用===================================
        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new String("a"), "1");
        identityHashMap.put(new String("a"), "2");
        identityHashMap.put(new String("a"), "3");
        System.out.println(identityHashMap.size()); //3

        Map<IdentityHashMapDemo, String> identityHashMap2 = new IdentityHashMap<>();
        identityHashMap2.put(new IdentityHashMapDemo(1), "1");
        identityHashMap2.put(new IdentityHashMapDemo(1), "2");
        identityHashMap2.put(new IdentityHashMapDemo(1), "3");
        System.out.println(identityHashMap2.size()); //3

        System.out.println(identityHashMap.get("a")); //null
        System.out.println(identityHashMap2.get(new IdentityHashMapDemo(1))); //null


        // ==比较的是地址值，而不是HashCode，所以这里以后千万不要掉进误区了。
        IdentityHashMapDemo demo1 = new IdentityHashMapDemo(1);
        IdentityHashMapDemo demo2 = new IdentityHashMapDemo(1);
        System.out.println(demo1 == demo2); //false
        System.out.println(demo1.hashCode()); //1
        System.out.println(demo2.hashCode()); //1
        System.out.println(System.identityHashCode(demo1)); //998351292
        System.out.println(System.identityHashCode(demo2)); //1684106402

        IdentityHashMapDemo demo3 = new IdentityHashMapDemo(1);
        IdentityHashMapDemo demo4 = new IdentityHashMapDemo(1);
        Map<IdentityHashMapDemo, String> identityHashMap3 = new IdentityHashMap<>();
        identityHashMap3.put(demo3,"demo3");
        identityHashMap3.put(demo4,"demo4");
        System.out.println(identityHashMap3.get(demo3)); //demo3

        String a1= new String("a");
        String a2 = new String("a");
        String a3= new String("a");
        Map<String, String> identityHashMapStr = new IdentityHashMap<>();
        identityHashMapStr.put(a1, "a1");
        identityHashMapStr.put(a2, "a2");
        identityHashMapStr.put(a3, "a3");
        System.out.println(identityHashMapStr.size()); //3
        System.out.println(identityHashMapStr.get(a1));


    }
}
