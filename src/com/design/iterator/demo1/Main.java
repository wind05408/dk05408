package com.design.iterator.demo1;

/**
 * Created by dk05408 on 2016/12/26.
 */
public class Main {

    public void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }

    public static void main(String[] args) {
        Main client = new Main();
        client.operation();

    }
}
