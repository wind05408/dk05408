package com.collection;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/7/23 20:58
 * Description:${TODO}
 */
public class BitSetMain {
    public static void main(String[] args) {
//        bidset1();
//        bidset3();
        bidset4();
    }

    public static void bidset1(){
        BitSet bm=new BitSet();
        System.out.println(bm.isEmpty()+"--"+bm.size());
        bm.set(0);
        System.out.println(bm.isEmpty()+"--"+bm.size());
        bm.set(1);
        System.out.println(bm.isEmpty()+"--"+bm.size());
        System.out.println(bm.get(65));
        System.out.println(bm.isEmpty()+"--"+bm.size());
        bm.set(65);
        System.out.println(bm.get(65));
        System.out.println(bm.isEmpty()+"--"+bm.size());
        bm.set(129);
        System.out.println(bm.isEmpty()+"--"+bm.size());

        bm.set(111);
        System.out.println(bm.isEmpty()+"--"+bm.size());
        System.out.println(bm);
    }


    public static void bidset2(){
        BitSet bm1=new BitSet(7);
        System.out.println(bm1.isEmpty()+"--"+bm1.size());

        BitSet bm2=new BitSet(63);
        System.out.println(bm2.isEmpty()+"--"+bm2.size());

        BitSet bm3=new BitSet(65);
        System.out.println(bm3.isEmpty()+"--"+bm3.size());

        BitSet bm4=new BitSet(111);
        System.out.println(bm4.isEmpty()+"--"+bm4.size());
    }

    public static void bidset3(){
        int[] data={2,134,64};
        //默认64，超过集合容量会扩大，从而影响效率，所以初始化时最好按照数组最大值进行初始化
        BitSet bs=new BitSet(64);
        System.out.println("bs.size()--"+bs.size());

        //默认BitSet是false
        for(int i=0;i<data.length;i++){
            bs.set(data[i], true) ;
        }
        for(int i=0;i<bs.size();i++){
            if(bs.get(i)){
                System.out.println(i);
            }
        }
    }

    public static void bidset4(){
        Random random=new Random();

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            int randomResult=random.nextInt(100);
            list.add(randomResult);
        }
        System.out.print("0~100之间产生的随机数有:");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("0~100之间的随机数产生了"+list.size()+"个");
        BitSet bitSet=new BitSet(100);
        for(int i=0;i<100;i++)
        {
            bitSet.set(list.get(i));
        }
        //public int cardinality()方法返回此BitSet中比特设置为true的数目
        //就是BitSet中存放的有效位的个数，如果有重复运算会进行自动去重
        System.out.println("0~100存在BitSet的随机数有"+bitSet.cardinality()+"个");
        System.out.print("0~100不在上述随机数中有:");
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if(!bitSet.get(i))
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        //0~100不在产生的随机数中的个数就是100减去存在BitSet的随机数个数
        System.out.print("0~100不在产生的随机数中的个数为:"+count+"个");
    }
}
