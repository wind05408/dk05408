package com.design.strategy.demo1;

/**
 * Price
 *
 * @author dk
 * @date 2016/11/21
 */
public class Price {
    private  MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double bookPrice){
        return this.memberStrategy.callPrice(bookPrice);
    }
}
