package com.design.composite.demo1;

/**
 * Created by dk05408 on 2016/12/28.
 */
public class HRDepartment extends Company {

    public HRDepartment(){

    }

    public HRDepartment(String name){
        super(name);
    }

    @Override
    protected void add(Company company) {

    }

    @Override
    protected void remove(Company company) {

    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName() ) ;
    }
}
