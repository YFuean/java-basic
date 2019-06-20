package com.soft1841.week3;

public class Fibonacci {
    public static void main(String[] args) {
        //定义前两项
        int F0 = 0;
        int F1 = 1;
        System.out.println("斐波那契数列：");
        System.out.print(F0 + "  " + F1);
        //定义第三项变量，无需初始化
        int F2 = 1;
        //定义一个for循环变量i
        int i;
        for (i = 2; i <= 10 ; i++) {
            F2 = F0 + F1;
            System.out.print("  " + F2);
            //挪动F1,F2
            F0 = F1;
            F1 = F2;
        }
        long sum = F0 + F1;
        sum = sum + F2;
        System.out.println("数列的和为：" + sum);

    }
}
