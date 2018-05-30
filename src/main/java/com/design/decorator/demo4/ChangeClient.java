package com.design.decorator.demo4;

/**
 * ChangeClient
 *
 * @author dk
 * @date 2016/12/7
 */
public class ChangeClient {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
//        TheGreatestSage bird = new Bird(sage);
//        TheGreatestSage fish = new Fish(bird);
        TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();

    }
}
