package com.design.strategy.demo1;

/**
 * Created by dk05408 on 2016/11/21.\
 * 　根据描述，折扣是根据以下的几个算法中的一个进行的：

 　　算法一：对初级会员没有折扣。

 　　算法二：对中级会员提供10%的促销折扣。

 　　算法三：对高级会员提供20%的促销折扣。
 */
public interface MemberStrategy {

    double callPrice(double booksPrice);

}
