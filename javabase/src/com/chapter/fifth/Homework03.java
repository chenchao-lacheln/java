package com.chapter.fifth;

public class Homework03 {
    public static void main(String[] args) {
//        输入1-100之间不能被5整除的数，每五个一行
        int count = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 5 != 0){
                count++;
                System.out.print(i + "\t");
                if (count % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}
