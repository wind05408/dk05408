package com.data.structure;

/**
 * @author dk
 * @date 2016/1/13
 */
public class LinkedList {
    private LinkedListNode head = new LinkedListNode("head",null,null);

    public LinkedList() {
        head.next = head.previous = head;
    }

    public LinkedListNode getFirst(){
        LinkedListNode node = head.next;
        if(head==node){
            return null;
        }
        return node;
    }
    public LinkedListNode getLast(){
        LinkedListNode node = head.previous;
        if(head==node){
            return null;
        }
        return node;
    }

    public LinkedListNode addFirst(LinkedListNode node){
        node.next = head.next;
        node.previous = head;
        node.previous.next = node;
        node.next.previous = node;
        return node;
    }


    public LinkedListNode addFirst(Object object){
        LinkedListNode node = new LinkedListNode(object,head.next,head);
         node.previous.next = node;
         node.next.previous = node;
        return node;
    }

    public LinkedListNode addLast(Object object){
        LinkedListNode node = new LinkedListNode(object,head,head.previous);
        node.previous.next = node;
        node.next.previous = node;
        return node;
    }

    public void clear(){
        LinkedListNode node = getLast();
        while (node!=null){
            node.remove();
            node =getLast();
        }
        head.next = head.previous = head;
    }

    public String toString(){
        LinkedListNode node = head.next;
        StringBuffer buffer = new StringBuffer();
        while (node!=head){
            buffer.append(node.toString()).append(",");
            node = node.next;
        }
        return buffer.toString();
    }
}
