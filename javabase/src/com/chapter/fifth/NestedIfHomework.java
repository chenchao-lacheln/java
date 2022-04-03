package com.chapter.fifth;
import java.util.Scanner;

public class NestedIfHomework {
    public static void main(String[] args) {
//        出票系统，根据淡旺季的月份和年龄，打印票价
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入当前月份");
        double checkPrice = 60.0;
        int occurMonth = myScanner.nextInt();
        System.out.println("请输入您的年龄：");
        int age = myScanner.nextInt();

        if (occurMonth >= 4 && occurMonth <= 10){
            if (age < 18 && age > 0){
                System.out.println("您需要支付半价" + checkPrice/2 + "元");
            }else if (age >= 18 && age <= 60){
                System.out.println("您需要支付" + checkPrice + "元");
            }else if (age > 60 && age < 150){
                System.out.println("您需要支付" + checkPrice/3 + "元");
            }else {
                System.out.println("您输入的年龄有误，请重先输入，谢谢！");
            }
        }else if ((occurMonth >= 1 && occurMonth <= 3) || (occurMonth >=11 && occurMonth <= 12)){
            if ((age < 18 && age > 0) || (age > 60 && age < 150)){
                System.out.println("您需要支付" + checkPrice/3 + "元");
            }else if (age >= 18 && age <= 60) {
                System.out.println("您需要支付" + checkPrice/1.5 + "元");
            } else {
                System.out.println("您输入的年龄有误，请重先输入，谢谢！");
            }
        }else {
            System.out.println("您输入的月份有误，请重先输入，谢谢！");
        }
    }
}
