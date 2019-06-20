package com.soft1841.week5;

import java.util.Random;

public class BobbleSort {
    public static void main(String[] args) {
        int N= 10;
        int[] number = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            number[i] = random.nextInt(100);
        }
        System.out.println("排序前：");
        for (int n:number) {
            System.out.print(n + " ");
        }

        int t;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1;j < 10; j++) {
                if (number[i] > number[j]) {
                    t = number[i];
                    number[i] = number[j];
                    number[j] = t;
                }
            }
        }
        System.out.println("\n排序后：");
        for (int n:number) {
            System.out.print(n + " ");
        }
    }
}
