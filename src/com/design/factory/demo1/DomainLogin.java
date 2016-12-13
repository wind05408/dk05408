package com.design.factory.demo1;

/**
 * DomainLogin
 *
 * @author dk
 * @date 2016/12/12
 */
public class DomainLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        System.out.println("DomainLogin verify");
        return true;
    }
}
