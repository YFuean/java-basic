package com.soft1841.week4;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class YangHuiTriangle {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = System.out;
        PrintStream ps = new PrintStream( "./log.text");
        System.setOut(ps);
        System.out.println("请输入杨辉三角的行数：");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        long temp = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < i + 1; j++){
                if (i == 0 || j == 0 || i == 1){
                    temp = 1;
                    System.out.print(temp + " ");
                }else {
                    temp = temp * ( i + 1 - j)/j;
                    System.out.print(temp + " ");
                }
            }
            System.out.println();
        }
    }
}
