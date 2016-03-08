package com.data.structure;

import java.io.Serializable;
import java.util.*;

/**
 * @author dk
 * @date 2016/1/13
 */
public class Linked<E> extends AbstractSequentialList<E> implements List<E>,Deque<E>,Cloneable,Serializable {
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    public Linked(){
    }

    public Linked(Collection<? extends E> c){
        this();
        addAll(c);
    }

    private void LinkFirst(E e){
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null,e,f);
        first = newNode;
        if(f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l,e,null);
        last = newNode;
        if(l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addFirst(E e) {
      final Node<E> f = first;

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new DescendingIterator();
    }

    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;
        Node(Node<E> prev,E item,Node<E> next){
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    public class DescendingIterator implements Iterator<E>{
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
