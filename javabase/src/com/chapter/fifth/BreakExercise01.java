package com.chapter.fifth;

public class BreakExercise01 {
    public static void main(String[] args) {
        int sum = 0;
        int n =0;
        for (int i = 1;1 <= 100;i++){
            sum += i;
            if (sum > 20){
                System.out.println("和第一次大于20！当前数i=" + i);
                n = i;
                break;
            }
        }
        System.out.println("和第一次大于20！当前数n=" + n);
    }
}
