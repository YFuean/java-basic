package com.soft1841.week3;

public class StudentNumber {
    public static void main(String[] args) throws InterruptedException {
        //学号前缀初始化
        String stuNo = "18023433";
        //循环变量初始化
        int i = 1;
        //循环条件
        while (i <= 40){
            if (i < 10){
                System.out.println(stuNo + "0" + i);
            }else {
                System.out.println(stuNo + i);
            }
            i++;
            Thread.sleep(500);
        }
    }
}
