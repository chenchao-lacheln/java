package com.chapter.sisth;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        double score[] = new double[5];

        Scanner myScanner = new Scanner(System.in);
        for (int i = 0;i < score.length;i++){
            System.out.println("请输入第" + (i+1) + "个元素的值");
            score[i] = myScanner.nextDouble();
        }

        for (int i = 0;i < score.length;i++){
            System.out.println("第" + (i+1) + "个元素的值=" + score[i]);
        }

    }
}
