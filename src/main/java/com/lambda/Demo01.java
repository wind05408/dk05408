package com.lambda;

public class Demo01 {
    public static void main(String[] args) {
        //原型
        cookFood(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("我太难了");
            }
        });

        //使用Lambda表达式
        cookFood(()->{
            System.out.println("我实现了接口方法");
        });

        //优化简写
        cookFood(() -> System.out.println("我最简单"));

    }

    private static void cookFood(Cook cook) {
        cook.makeFood();
    }
}