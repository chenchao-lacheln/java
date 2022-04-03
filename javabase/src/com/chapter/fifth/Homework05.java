package com.chapter.fifth;

public class Homework05 {
    public static void main(String[] args) {
//        注意需要把分子1，写成1.0才能保留精度。 只需要把1改成1.0就可以了
        double sum = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 == 0){
                sum -= 1.0/i;
            }else{
                sum += 1.0/i;
            }
        }
        System.out.println("sum=" + sum);

    }
}
