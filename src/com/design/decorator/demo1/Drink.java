package com.design.decorator.demo1;

/**
 * Created by dk05408 on 2016/12/6.
 */
public abstract class Drink {
    private String description ="";
    private float price= 0f;

    public String getDescription() {
        return description +"-"+this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
