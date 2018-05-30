package com.design.composite.demo1;

/**
 * Created by dk05408 on 2016/12/28.
 */
public abstract class Company {
    private String name;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void add(Company company);

    protected abstract void remove(Company company);

    protected abstract void display(int depth);
}
