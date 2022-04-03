package com.chapter.fifth;
import java.util.Scanner;


public class MulFroExercise01 {
    public static void main(String[] args) {
//        统计 3 个班成绩情况，每个班有 5 名同学
//        求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]
//        统计三个班及格人数，每个班有 5 名同学
//      思路分析
//        统计一个班的学习成绩情况
        Scanner myScanner = new Scanner(System.in);

        int passNum = 0;
        double totalSum = 0;
        for (int i = 1; i <= 3; i++) {
            double sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第" + i +"个班级的第" + j + "个学生的成绩");
                double score = myScanner.nextDouble();
                if (score >= 60){
                    passNum++;
                }
                sum += score;
                System.out.println("成绩为" + score);
            }
            System.out.println("sum=" + sum + "平均分为：" + (sum / 5));
            totalSum += sum;
        }
        System.out.println("totalSum=" + totalSum + "所有班级的总平均分为=" + (totalSum / 15));
        System.out.println("三个班的及格人数为=" + passNum + "人");
    }
}
