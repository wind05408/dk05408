package com.design.strategy.demo1;

/**
 * PriceClient
 *
 * @author dk
 * @date 2016/11/21
 */
public class PriceClient {
    public static void main(String[] args) {

        MemberStrategy AdvancedStrategy = new AdvancedMemberStrategy();
        Price price = new Price(AdvancedStrategy);
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);

        MemberStrategy primaryStrategy = new PrimaryMemberStrategy();
        price = new Price(primaryStrategy);
        quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);

        MemberStrategy intermediateStrategy = new IntermediateMemberStrategy();
        price = new Price(intermediateStrategy);
        quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
