package com.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/1
 * 方法走完，引用消失，堆内存还未必消失。
 * 好多人在做报表导出的时候，就会在for循环里不断的创建对象，
 * 很容易造成堆溢出，请问这种大文件导出怎么破？
 * 建议不要在for里创建对象，可以在外面搞一个对象，for循环里对一个对象修改数据即可
 **/
public class UserMain {
    public static void main(String[] args) {
        //建议不要在for里创建对象，可以在外面搞一个对象，for循环里对一个对象修改数据即可
        List<User> users = new ArrayList<>();
        User user;
        for (int i = 0; i <1000 ; i++) {
          user = new User(i,"name_"+i);
          users.add(user);
        }
        System.out.println(users.size());
    }
}
