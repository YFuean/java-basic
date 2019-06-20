package com.soft1841.week2;

/**
 * 根据升高体重计算BMI的程序
 * author 岳凡
 */
public class BMIexponent<exponent, weight, height> {
    public  static void main(String[] args ){
        double height = 1.72;
        int weight = 70;
        double exponent = weight / (height * height);
        System.out.println("您的身高为：" + height);
        System.out.println("您的体重为：" + weight);
        System.out.println("您的BMI指数为：" + exponent);
        System.out.print("您的体重属于：");
        if (exponent < 18.5){
            System.out.println("体重过轻");
        }
        if (exponent >= 18.5 && exponent < 24.9) {
            System.out.println("正常范围");
        }
        if (exponent >= 24.9 && exponent < 29.9){
            System.out.println("体重过重");
        }
        if (exponent >= 29.9){
            System.out.println("肥胖");
        }
    }
}
