package com.design.composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dk05408 on 2016/12/28.
 */
public class ConcreteCompany extends Company {
    private List<Company> list;

    public ConcreteCompany(){
        list = new ArrayList<>();
    }

    public ConcreteCompany(String name) {
        super(name);
        list = new ArrayList<>();
    }

    @Override
    protected void add(Company company) {
        list.add(company);
    }

    @Override
    protected void remove(Company company) {
        list.remove(company);
    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i <depth ; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb)+this.getName());
        for (Company company:list) {
            company.display(depth+2);
        }

    }
}
