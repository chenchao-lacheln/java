package com.chapter.fifth;
import java.util.Scanner;

public class IfExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入第一个数");
//        double array1 = myScanner.nextDouble();
//        System.out.println("请输入第二个数");
//        double array2 = myScanner.nextDouble();
//        if (array1 > 10.0 && array2 < 20.0){
//            double totalSum = array1 + array2;
//            System.out.println("两数之和为" + totalSum);
//        }else{
//            System.out.println("抱歉第二个数为" + array2 + "，该数大于20.0，不符合要求");
//        }

//        判断是否是闰年
//        System.out.println("请输入年份");
//        int years = myScanner.nextInt();
//        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0){
//            System.out.println(years + "年为闰年");
//        }else {
//            System.out.println(years + "年不是闰年");
//        }

//        判断芝麻信用分
        System.out.println("请输入芝麻信用分：");
        int advantage = myScanner.nextInt();
        if (advantage >= 1 && advantage <= 100) {
            if (advantage == 100) {
                System.out.println("信用极好");
            } else if (advantage > 80 && advantage <= 99) {
                System.out.println("信用优秀");
            } else if (advantage >= 60 && advantage <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        } else {
            System.out.println("您的输入有误，请重先输入1-100之间的数字");
        }
    }
}
