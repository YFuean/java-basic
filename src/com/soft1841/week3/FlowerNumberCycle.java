package com.soft1841.week3;

/**
 * 用循环求出1000以内所有水仙花数
 * 2018.10.22
 */
public class FlowerNumberCycle {
    public static void main(String[] args) {
        //定义初始值
        int i = 100;
        //开始循环
        while (i < 999){
            i++;
            int hundred = i /100;
            int ten = i / 10 % 10;
            int digit = i % 10;
            if (i == hundred*hundred*hundred + ten*ten*ten + digit*digit*digit){
                System.out.println("水仙花数为" + i);
            }
        }
    }
}


