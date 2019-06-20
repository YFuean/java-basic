package com.soft1841.week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo5 {
    public static void main(String[] args) {
        String password = "2831gddXUE";
        String regexp = "[0-9a-zA-Z]{6,20}";
        boolean flag = password.matches(regexp);
        System.out.println(flag);
    }
}
