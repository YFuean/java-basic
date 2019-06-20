package com.soft1841.week2;

import java.util.Random;

/**
 * 随机数小程序
 * 2018.10.17
 */
public class RandomNumber {
    public static void main(String[] args) {
        //定义三个整型变量，分别表示百十个
        int hundreds;
        int decade;
        int digit;
        //定义一个整型，用来表示三位数
        int number;
        //定义一个随机数种子
        Random random = new Random();
        //随机产生【0，n）之间的正整数
        hundreds = random.nextInt(10);
        decade = random.nextInt(10);
        digit = random.nextInt(10);
        System.out.println("百位是：" + hundreds +",十位是：" + decade +",个位是：" + digit);
        number = hundreds * 100 + decade * 10 + digit;
        System.out.println("结果是：" + number);
    }
}
