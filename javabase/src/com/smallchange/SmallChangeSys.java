package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    /**
     * @param args
     * 1.先完成显示菜单，并可以选择菜单，给出相应的提示
     * 2.完成零钱通明细
     * 3.收益入账
     */
    public static void main(String[] args) {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        /**
         * 2.完成零钱通明细的思路
         * （1）可以把收益入账和消费，保存到数组
         * （2）可以使用对象
         * （3）简单的话可以使用String拼接
         */
        //选择第（3）个方法
        String details = "----------零钱通明细----------";

        /**
         * 3.收益入账的思路
         * （1）定义新的变量
         */
        double money = 0;
        double balance = 0;
        Date date = null;//date 是 java.util.Date 类型，表示日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用户日期格式化

        do {
            System.out.println("\n==========零钱通菜单==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消    费");
            System.out.println("\t\t4 退    出");

            System.out.print("请选择（1-4）: ");
            key = scanner.next();

            //使用switch 分支控制
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    //money的值得范围 需要进行校验

                    balance += money;
                    //拼接收益入账信息到 details
                    date = new Date();//获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + "余额:" + balance;

                    break;
                case "3":
                    System.out.println("3 消    费");
                    break;
                case "4":
                    System.out.println("4 退    出");
                    loop = false;
                    break;
                default:
                    System.out.println("选择有误，请重先选择");
            }

        }while (loop);

        System.out.println("=========退出了零钱通项目==========");
    }
}
