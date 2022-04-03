package com.chapter.fifth;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入数字:");
        int nums  = myScanner.nextInt();
        if (nums > 0 && nums< 1000){
            int a = nums / 100;
            int b = (nums % 100) / 10;
            int c = nums % 10;
            if (nums == a*a*a + b*b*b + c*c*c){
                System.out.println(nums + "为水仙花树！");
            }else {
                System.out.println(nums + "不是水仙花树！");
            }
        }else {
            System.out.println("您的输入有误，请重先输入！");
        }

    }
}
