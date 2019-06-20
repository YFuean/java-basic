package com.soft1841.week7;

public class FlyTest {
    public static void main(String[] args) {
        //通过借口回调，创建一个Pane的实例给接口变量
        Fly fly1 = new Plane("波音747",940.0);
        //调用fly()方法，输出飞机的飞行信息
        System.out.println(fly1.fly());

        //通过接口回调，创建一个Build的实例给接口变量
        Fly fly2 = new Bird("老鹰",40.5);
        //调用fly()方法，输出老鹰的飞行信息
        System.out.println(fly2.fly());
    }
}
