package com.soft1841.week6;

public class StringDemo3 {
    public static void main(String[] args) {
        String[] fileNames = {
                "23.png","ff.doc","哈哈.jpg","882hhg.doc","2dh.exe"
        };
        int imgCount = 0;
        int docCount = 0;

        for (String fileName:fileNames) {
            if (fileName.endsWith(".jpg") || fileName.endsWith(".png")){
                imgCount++;
            }
            if (fileName.endsWith(".doc")) {
                docCount++;
            }
        }
        System.out.println("图片有" +imgCount +",文档有" + docCount );
    }
}
