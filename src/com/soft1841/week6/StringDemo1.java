package com.soft1841.week6;

import java.util.UUID;

public class StringDemo1 {
    public static void main(String[] args) {
        String fileName = "11.jpg";

        String s1 = fileName.substring(2);
        String newFileName = UUID.randomUUID().toString() + s1;
        System.out.println(newFileName);
    }
}
