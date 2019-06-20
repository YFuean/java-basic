package com.soft1841.week6;

public class CakeApp {
    public static void main(String[] args) {
        Cake[] cakes ={
                new Cake("奶油","308.5","6"),
                new Cake("慕斯","464","7"),
                new Cake("水果","194.4","8"),
        };
        for (Cake cake:cakes) {
            System.out.println(cake);
        }

    }
}

class Cake{
    private String name;
    private String price;
    private String size;

    public Cake() {
    }

    public Cake(String name, String price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name +" "+this.size+"寸"+ this.price+"元";
    }
}
