package com.chapter.sisth;

public class TwoDimensionalArray02 {
    public static void main(String[] args) {
        int array[][] = new int[3][];
        for (int i = 0;i < array.length;i++){
            array[i] = new int[i + 1];
            for (int j = 0;j < array[i].length;j++){
                array[i][j] = i + 1;
            }
        }
        for (int i = 0;i < array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
