package com.soft1841.week4;

import java.util.Scanner;

/**
 * 求N个数的最小值
 */
public class Number {
    public static void main(String[] args) {
        final int COUNT = 5;
        int minNumber = 10000;
        int maxNumber = -10000;
        int i;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (i = 1; i <= COUNT; i++){
            System.out.println("请输入一个整数：");
            int number = scanner.nextInt();
            if (number < minNumber){
                minNumber = number;
            }
            if (number > maxNumber){
                maxNumber = number;
            }
            //无论大小都累加
            sum += number;
        }
        System.out.println("minNumber =" + minNumber);
        System.out.println("maxNumber =" + maxNumber);
        System.out.println("sum " + sum);
    }
}