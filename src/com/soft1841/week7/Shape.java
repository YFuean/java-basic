package com.soft1841.week7;

public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {
    }

    public void show(){
        System.out.print("面积");
    }

    public abstract double getArea();
}
