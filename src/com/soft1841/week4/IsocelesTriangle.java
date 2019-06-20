package com.soft1841.week4;

import java.util.Scanner;

public class IsocelesTriangle {
    public static void main(String[] args) {
        System.out.println("请输入等腰三角形的行数：");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (int i = 0; i < row; i++){
            //打印空格
            for (int j = 0; j < row -i; j++){
                System.out.print("  ");
            }
            //打印*
            for (int j = 0; j < 2*i + 1; j++){
                System.out.print("* ");
            }
            //每次打印完换行
            System.out.println();
        }
    }
}
