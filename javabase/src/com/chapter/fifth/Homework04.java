package com.chapter.fifth;

public class Homework04 {
    public static void main(String[] args) {
//        输出小写的a-z 以及大写的A-Z
        int count = 0;
        for (char c1 = 'a';c1 <= 'z';c1++){
            count++;
            System.out.print(c1 + "\t");
            if (count % 5 ==0){
                System.out.println();
            }
        }
        System.out.println("========");
        for (char c2 = 'Z';c2 >= 'A';c2--){
            System.out.print(c2 + " ");
        }
    }
}
