package com.design.template.demo2;

/**
 * MoneyMarketAccount
 *
 * @author dk
 * @date 2016/11/24
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
