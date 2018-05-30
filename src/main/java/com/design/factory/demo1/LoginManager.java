package com.design.factory.demo1;

/**
 * LoginManager
 *
 * @author dk
 * @date 2016/12/12
 */
public class LoginManager {

    public static Login factory(String type){

        if(type.equals("password")){
            return new PasswordLogin();
        }else if(type.equals("passcode")){
            return new DomainLogin();
        }else{
            /**
             * 这里抛出一个自定义异常会更恰当
             */
            throw new RuntimeException("没有找到登录类型");
        }
    }

}
