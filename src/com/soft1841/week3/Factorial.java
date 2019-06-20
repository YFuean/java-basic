package com.soft1841.week3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number;
        int result = 1;
        number = scanner.nextInt();
        //循环，条件为正整数
        while (number > 0) {
            result = result * number;
            number--;
        }
        System.out.println("结果为：" + result);
    }
}
