package com.chapter.fifth;

public class DoWhileExercise01 {
    public static void main(String[] args) {
//        统计1-200之间能被5整除，但不能被3整除的数
        int i = 1;
        int end = 200;
        int num1 = 3;
        int num2 = 5;
        int count = 0;
        do{
            if (i % num2 ==0 && i % num1 != 0) {
                System.out.println("i=" + i);
                count++;
            }
            i++;
        }while (i <= end);
        System.out.println("count" + count);
    }
}
