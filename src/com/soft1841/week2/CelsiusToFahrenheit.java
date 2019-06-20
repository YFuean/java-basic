package com.soft1841.week2;

import java.util.Scanner;

/**
 * 摄氏度转华氏度
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celesius;
        System.out.println("请输入摄氏度：");
        Scanner scanner = new Scanner(System.in);
        celesius = scanner.nextDouble();
        double fahrenheit = 1.8 * celesius + 32;
        System.out.println("结果是：" + fahrenheit);
        int result = (int) fahrenheit;
        System.out.println("整型结果是：" + result);
    }
}
