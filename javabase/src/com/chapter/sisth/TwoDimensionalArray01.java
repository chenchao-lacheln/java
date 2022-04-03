package com.chapter.sisth;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        int[][] array = {{0,0,0,0,0},{0,2,0,0,0},{0,5,0,6,0},{0,0,9,0,0}};

        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
