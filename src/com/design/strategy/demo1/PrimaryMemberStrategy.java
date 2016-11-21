package com.design.strategy.demo1;

/**
 * PrimaryMemberStrategy
 *
 * @author dk
 * @date 2016/11/21
 * 初级会员折扣类
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double callPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
