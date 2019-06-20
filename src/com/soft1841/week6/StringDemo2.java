package com.soft1841.week6;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "I love java";
        String[] letters = str.split(" ");
        for (String letter:letters) {
            System.out.println(letter);
        }
    }
}
