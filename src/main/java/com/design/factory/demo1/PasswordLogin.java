package com.design.factory.demo1;

/**
 * PasswordLogin
 *
 * @author dk
 * @date 2016/12/12
 */
public class PasswordLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        System.out.println("PasswordLogin verify");
        return true;
    }
}
