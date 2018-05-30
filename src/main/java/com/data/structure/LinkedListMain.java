package com.data.structure;

/**
 * @author dk
 * @date 2016/1/13
 */
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList =new LinkedList();
        linkedList.addFirst("1");
        linkedList.addLast("2");
        linkedList.addLast("3");
        System.out.println(linkedList.toString());
        linkedList.clear();
        System.out.println(linkedList.toString());
    }
}
