package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/20
 **/
public class PersonLambda {
    public static void main(String[] args) {
        //使用数组存储Person对象
        Person[] person = {
                new Person("sda",12),
                new Person("sa",19),
                new Person("da",10)
        };

        Arrays.sort(person,(Person p1,Person p2)->{return p1.getAge()-p2.getAge();});
        Arrays.sort(person,(p1,p2)->p1.getAge()-p2.getAge());


        //增强for循环打印输出
        for (Person p:person) {
            System.out.println(p);
        }

        List list = new ArrayList();
        list.add(10);
        list.add(15);
        list.add(9);
        list.add(11);
        list.forEach(System.out::println);

        }
    }

