package com.soft1841.week3;

import java.util.Scanner;

/**
 * 可循环操作的ATM程序
 */
public class LoopATM {
    public static void main(String[] args) throws InterruptedException {
        int total = 1000;
        System.out.println("欢迎来到ATM取款机，本机只处理100元面值人民币");
        System.out.println("请插入银行卡");
        int choice;
        Scanner scanner = new Scanner(System.in);
        boolean loopFlag = true;
        while (loopFlag){
            Thread.sleep(1000);
            System.out.println("**********");
            System.out.println("1.取款");
            System.out.println("2.存款");
            System.out.println("3.查询余额");
            System.out.println("4.退出");
            System.out.println("**********");
            System.out.println("请选择你要的操作：");
            //接收一个整数1 2 3 4，对应不同的功能
            choice = scanner.nextInt();
            //采用switch语言，让不同的choice对应不同的分支功能
            switch (choice) {
                case 1:
                    System.out.println("请输入金额：");
                    int withdraw = scanner.nextInt();
                    //金额没有超限
                    if (withdraw <= 1000) {
                        //且为100的倍数（ATM处理人民币面值规定）
                        if (withdraw % 100 == 0) {
                            total = total - withdraw;
                            System.out.println("取了" + withdraw + "元，当前余额为" + total);
                        }else {
                            System.out.println("只能取100元面值的人民币！");
                        }
                    }else {
                        System.out.println("余额不足");
                    }
                    break;
                case 2:
                    System.out.println("请输入存款金额");
                    int deposit = scanner.nextInt();
                    //只能存100元面值
                    if (deposit % 100 == 0) {
                        total = total + deposit;
                        System.out.println("存了" + deposit + "元，当前余额为" + total);
                    }else {
                        System.out.println("只能存100元面值的人民币！");
                    }
                    break;
                case 3:
                    System.out.println("当前余额为" + total);
                    break;
                case 4:
                    System.out.println("退卡中，欢迎下次再来" );
                    Thread.sleep(2000);
                    loopFlag = false;
            }
        }
    }
}
