package com.chapter.fifth;

public class Homework06 {
    public static void main(String[] args) {
        /**
         * 求1 + （1+2）+（1+2+3）+----+（1+2+3+---+100）
         */
        int begin = 1;
        int end = 100;
        int sum = 0;
        for (int i = begin;i <= end;i++){
            for (int j = end;j >= begin;j--){
                if (i + j == begin + end) {
                    sum += i * j;
                    break;
                }
            }
        }
        System.out.println("sum=" + sum);

        int total = 0;
        for (int a = 1;a <= 100;a++){
            for (int b = 1;b <= a;b++){
                total += b;
            }
        }
        System.out.println("total = " + total);
    }
}
