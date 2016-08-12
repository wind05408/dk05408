package com.spring.reflect;

/**
 * ReflectVO
 *
 * @author dk
 * @date 2016/8/12
 */
public class ReflectVO {
    private String brand;
    private String color;
    private int maxSpeed;

    public ReflectVO() {
    }

    public ReflectVO(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public void introduce() {
        System.out.println("brand:"+brand+";color:"+color+";maxSpeed:" +maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
