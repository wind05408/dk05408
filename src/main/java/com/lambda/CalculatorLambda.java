package com.lambda;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/20
 **/
public class CalculatorLambda {
    public static void main(String[] args) {
        //使用匿名的方法求和
        //运行步骤：匿名创建实现类->实现类实现（重写）接口方法->传递匿名实现类->
        //->传递不定数量的数值->c.calc(sNum)调用接口方法计算值，并返回值给sum
        int sum = sumNumber(new Calculator() {
            int sum=0;
            //重写方法，无实参值运算
            @Override
            public int calc(int... num) {
                for (int n: num) {
                    sum+=n;
                }
                return sum;
            }
        },7,8,9);

        int lambdaSum= sumNumber((int ...num)->{
            int temp = 0;
            for (int n:num) {
                temp+=n;
            }
            return temp;
        },74,22,11);

        System.out.println(sum);
        System.out.println(lambdaSum);
    }

    private static int sumNumber(Calculator c, int ...sNum) {
        //把数组地址给接口方法的不定值num
        int sum = c.calc(sNum);
        return sum;
    }
}
