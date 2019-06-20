package com.soft1841.week4;

public class StarMatrix {
    public static void main(String[] args) {
        final int COUNT = 5;
        for (int i = 0;i < COUNT;i ++){
            for (int j = 0;j <i +1;j ++){
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}
