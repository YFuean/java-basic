package com.soft1841.week6;

import javafx.application.Application;

public class FlowerApp{
    public static void main(String[] args) {
        Flower[] flowers ={
                new Flower("玫瑰","90"),
                new Flower("康乃馨","70.58"),
                new Flower("满天星","62.8"),
        };
        for (Flower flower:flowers) {
            System.out.println(flower);
        }
    }
}



class Flower{
    private String flowerName;
    private String flowerPrice;

    public Flower() {
    }

    public Flower(String flowerName, String flowerPrice) {
        this.flowerName = flowerName;
        this.flowerPrice = flowerPrice;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerPrice(String flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    @Override
    public String toString() {
        return this.flowerName +" " + this.flowerPrice;
    }
}