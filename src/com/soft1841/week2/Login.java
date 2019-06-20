package com.soft1841.week2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //定义账号变量
        String account = null;
        //定义密码变量
        String password = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入账号：");
        account = scanner.nextLine();
        System.out.print("请输入密码：");
        password = scanner.nextLine();
        if (account.equals("soft1841@qq.com") && password.equals("Soft_1841")){
            System.out.println("账号密码输入正确，登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
