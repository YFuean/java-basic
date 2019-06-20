package com.soft1841.week5;

public class SingerApp {
    public static void main(String[] args) {
        //创建歌手数组
        //int[] a = new int[5];
        final int N = 8;
        Singer[] singers = new Singer[]{
                new Singer("歌手排行榜","singer0.png"),
                new Singer("薛之谦","singer1.png"),
                new Singer("花粥","singer2.png"),
                new Singer("陈奕迅","singer3.png"),
                new Singer("林俊杰","singer4.png"),
                new Singer("邓紫棋","singer5.png"),
                new Singer("林宥嘉","singer6.png"),
                new Singer("王贰浪","singer7.png"),
        };
        for (Singer singer:singers) {
            System.out.println(singer);
        }
    }
}
