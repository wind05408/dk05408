package com.design.iterator.demo1;

/**
 * Created by dk05408 on 2016/12/26.
 */
public class ConcreteAggregate extends Aggregate {
    public Object[] objArray = null;

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index){
        if(index<objArray.length){
            return objArray[index];
        }else {
            return null;
        }
    }

    public int size(){
        return objArray.length;
    }
}
