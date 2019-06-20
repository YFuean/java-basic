package com.soft1841.week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int i;
        for (i = 2; i <number; i++){
            if (number % i == 0){
                break;
            }
        }
        if (i >= number){
            System.out.println("是素数");
        }else {
            System.out.println("不是素数");
        }
    }
}
