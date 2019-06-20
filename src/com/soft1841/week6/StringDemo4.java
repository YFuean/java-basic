package com.soft1841.week6;

public class StringDemo4 {
    public static void main(String[] args) {
        String content = "人生本没有意义，" +
                "每个人都要给自己规定一个人生的意义，" +
                "我要思考的结果是";
        String finalStr = content.replaceAll("人","**");
        System.out.println(finalStr);
    }
}
