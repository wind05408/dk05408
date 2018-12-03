package com.data.map;

/**
 * @author: dk05408
 * @date: 2018/12/3 13:46
 * Description:
 */
public class IdentityHashMapDemo {
    private Integer age;

    public IdentityHashMapDemo(Integer age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return age;
    }
}
