package com.data.structure;

/**
 * @author dk
 * @date 2016/1/13
 */
public class LinkedListNode {
    public LinkedListNode previous;//ǰһ���
    public LinkedListNode next;//��һ�ڵ�
    public Object object;

    public LinkedListNode(Object object,LinkedListNode next, LinkedListNode previous) {
        this.previous = previous;
        this.next = next;
        this.object = object;
    }

    public void remove(){
        previous.next = next;
        next.previous = previous;
    }

    public String toString(){
        return object.toString();
    }
}
