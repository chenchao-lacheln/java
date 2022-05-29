package com.lacheln.try_;

import java.util.Scanner;

/**
 * TryCatchException02
 *
 * @author lacheln
 * @date 2022/5/29 14:22
 * @since 1.0.0
 */
public class TryCatchExercise01 {
    public static void main(String[] args) {
         //如果用户输入的不是一个整数，就提示反复输入，直到输入一个整数为止
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true){
            System.out.println("请输入一个整数：");
            try {
                num = Integer.parseInt(scanner.next());//可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数：");
            }
        }
        System.out.println("你输入的值是 = " + num);
    }
}
