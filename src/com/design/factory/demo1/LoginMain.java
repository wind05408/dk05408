package com.design.factory.demo1;

/**
 * LoginMain
 *
 * @author dk
 * @date 2016/12/12
 */
public class LoginMain {
    public static void main(String[] args) {
        String loginType = "password";
        String name = "name";
        String password = "password";
        Login login = LoginManager.factory(loginType);
        boolean bool = login.verify(name, password);
        if (bool) {
            System.out.println("verify true");
            /**
             * 业务逻辑
             */
        } else {
            System.out.println("verify false");
            /**
             * 业务逻辑
             */
        }
    }
}
