package com.soft1841.exam;

import java.util.Scanner;

/**
 * 数字分割练习
 * 88888888，分割为88，888，888
 */

public class NumberSplit {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        //通过StringBuffer构建可变字符串str
        StringBuffer str  = new StringBuffer(nums);
        System.out.println("处理前的字符串：");
        System.out.println(str);
        //进行逗号处理
        for (int i = nums.length(); i > 0 ; i = i - 3){
            if (i > 3) {
                str.insert(i-3,',');
            }
        }
        System.out.println(str);
    }
}
