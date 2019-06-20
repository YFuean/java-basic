package com.soft1841.week2;
import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        double height = 3;
        double radius = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高度：");
        height = scanner.nextDouble();
        System.out.println("请输入半径");
        radius = scanner.nextDouble();
        final  double PI = 3.1415926;
        double volume = PI*radius*radius*height;
        System.out.println("该粮仓的体积为" + volume +"立方米");
        double total = volume*750;
        System.out.println("每立方米屯粮750千克该粮仓一个可储" + total + "千克粮食");
    }
}
