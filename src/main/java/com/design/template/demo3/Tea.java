package com.design.template.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Tea
 *
 * @author dk
 * @date 2016/11/28
 */
public class Tea extends HotDrink {
    @Override
    protected void brew() {
        System.out.println("brew tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("addCondiments limon");
    }

    @Override
    public boolean wantAddCondiments() {
        System.out.println("您是否要添加调味品(y/n)：");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str="";
        try {
            str=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(str.equals("n")){
            return false;
        }
        return true;
    }
}
