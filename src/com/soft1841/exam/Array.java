package com.soft1841.exam;

public class Array {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4,5},{6,7,8,9,10}};

        for (int i=0; i<2; i++){
            for (int j = 0; j<5 ; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
