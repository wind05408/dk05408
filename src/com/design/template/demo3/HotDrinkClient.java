package com.design.template.demo3;

/**
 * HotDrinkClient
 *
 * @author dk
 * @date 2016/11/28
 */
public class HotDrinkClient {
    public static void main(String[] args) {
        HotDrink coffee = new Coffee();
        HotDrink tea = new Tea();
        coffee.prepare();
        System.out.println("--------------------------------------------------");
        tea.prepare();
    }
}
