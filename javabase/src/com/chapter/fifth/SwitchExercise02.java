package com.chapter.fifth;
import java.util.Scanner;

public class SwitchExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输输入学生成绩：");
        double score = myScanner.nextDouble();

        if (score >= 0 && score<= 100){
            switch ((int)(score/60)) {
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("及格");
    //            default:
    //                System.out.println("输入有误");
            }
        }else {
            System.out.println("输入的成绩为0-100之间，请重先输入：");
        }
        System.out.println("程序继续");
    }
}
