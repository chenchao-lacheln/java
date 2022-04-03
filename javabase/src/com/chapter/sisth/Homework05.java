package com.chapter.sisth;

public class Homework05 {
    public static void main(String[] args) {

        int[] number = new int[10];

        //随机生成10个1-100的数
        for (int i = 0;i <= 9;i++) {
            number[i] = (int) (Math.random() * 100) + 1;
            System.out.print(number[i] + "\t");
        }
        System.out.println();
        int sum = 0;
        //倒序输出
        int i = number.length - 1;
        for (;i >= 0;i--){
            sum += number[i];
            System.out.print(number[i] + "\t");
        }
        System.out.println("\n总和为=" + sum);
        System.out.println("\n平均值=" + sum/10.0);
    }
}
