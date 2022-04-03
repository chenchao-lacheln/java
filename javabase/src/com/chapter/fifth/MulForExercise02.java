package com.chapter.fifth;

public class MulForExercise02 {
    public static void main(String[] args) {
        //    打印99乘法表
        for (int i = 1;i < 10;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "X" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
