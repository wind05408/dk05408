package com.design.strategy.demo1;

/**
 * IntermediateMemberStrategy
 *
 * @author dk
 * @date 2016/11/21
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double callPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice*0.9;
    }
}
