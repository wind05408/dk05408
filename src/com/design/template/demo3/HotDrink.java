package com.design.template.demo3;

/**
 * HotDrink
 *
 * @author dk
 * @date 2016/11/28
 */
public abstract class HotDrink {

    public final void prepare(){
        boilWater();
        brew();
        pourInCup();
        if(wantAddCondiments()){
             addCondiments();
        }else {
            System.out.println("不用了，谢谢！！！");
        }
    }


    /**
     * final方法不让子类实现
     */
    public final void boilWater(){
        System.out.println("boilWater");
    }

    /**
     * abstract方法让子类实现
     */
    protected abstract void brew();

    public final void pourInCup() {
        System.out.println("pourInCup");
    }

    public  abstract void addCondiments();

    /**hook方法 子类可实现可不实现**/
    public boolean wantAddCondiments(){
        return true;
    }
}
