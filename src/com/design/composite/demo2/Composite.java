package com.design.composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dk05408 on 2016/12/28.
 */
public class Composite implements Component {
    private List<Component> childComponents = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }
    /**
     * 聚集管理方法，增加一个子构件对象
     * @param child 子构件对象
     */
    public void addChild(Component child){
        childComponents.add(child);
    }
    /**
     * 聚集管理方法，删除一个子构件对象
     * @param index 子构件对象的下标
     */
    public void removeChild(int index){
        childComponents.remove(index);
    }
    /**
     * 聚集管理方法，返回所有子构件对象
     */
    public List<Component> getChild(){
        return childComponents;
    }

    @Override
    public void printStruct(String component) {
        // 先把自己输出
        System.out.println(component + "+" + this.name);
        //如果还包含有子组件，那么就输出这些子组件对象
        if(this.childComponents != null){
            //添加两个空格，表示向后缩进两个空格
            component += "  ";
            //输出当前对象的子对象
            for(Component c : childComponents){
                //递归输出每个子对象
                c.printStruct(component);
            }
        }

    }
}
