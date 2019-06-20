package com.soft1841.week7;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Triangle(2.0,4.5);
        shape.show();
        System.out.print(shape.getArea());

        Shape shape1 = new Rectangle(3,5);
        shape1.show();
        System.out.print(shape1.getArea());

        Shape shape2 = new Cube(3,4,5);
        shape2.show();
        System.out.print(shape2.getArea());
    }
}
