package com.design.template.demo2;

/**
 * CDAccount
 *
 * @author dk
 * @date 2016/11/24
 */
public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
