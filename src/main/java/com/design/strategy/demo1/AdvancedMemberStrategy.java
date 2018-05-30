package com.design.strategy.demo1;

/**
 * AdvancedMemberStrategy
 *
 * @author dk
 * @date 2016/11/21
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double callPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
