package com.soft1841.week1;
        import  java.util.Scanner;
public class ATM {
    public static void main(String[] args) throws InterruptedException {
        int total = 1000;
        System.out.println("欢迎来到ATM取款机");
        System.out.println("请插入银行卡");
        Thread.sleep(3000);
        System.out.println("1.取款");
        System.out.println("2.存款");
        System.out.println("3.查询余额");
        System.out.println("4.退出");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("请输入取款金额");
            int withdraw = scanner.nextInt();
            if (withdraw <= 1000) {
                total = total - withdraw;
                System.out.println("取了" + withdraw + "元，当前余额为：" + total);
            } else  {
                System.out.println("余额不足！");
            }
        }
        if (choice == 2) {
            System.out.println("请输入存款金额");
            int deposit = scanner.nextInt();
            total = total + deposit;
            System.out.println("存了" + deposit + "元，当前余额为：" + total);
        }
        if (choice == 3) {
            System.out.println("当前余额是：" + total);
        }
        if (choice == 4) {
            System.out.println("欢迎下次光临");
            Thread.sleep(2000);
            int status;
            System.exit(0);
        }
    }
}
