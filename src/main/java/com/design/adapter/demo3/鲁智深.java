package com.design.adapter.demo3;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class 鲁智深 implements 和尚 {
    @Override
    public void 吃斋() {

    }

    @Override
    public void 念经() {

    }

    @Override
    public void 打坐() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 习武() {
        System.out.println("        拳打镇关西；\n" +
                "        大闹五台山；\n" +
                "        大闹桃花村；\n" +
                "        火烧瓦官寺；\n" +
                "        倒拔垂杨柳；");
    }

    @Override
    public String getName() {
        return "鲁智深";
    }
}
