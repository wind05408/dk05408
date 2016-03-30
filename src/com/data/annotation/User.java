package com.data.annotation;

/**
 * @author dk
 * @date 2016/3/30
 */
public class User {
    public int id;
    public String name ;
    public int age;
    public String gender;

    public User(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
