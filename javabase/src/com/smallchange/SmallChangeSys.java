package com.smallchange;

import java.util.Scanner;

public class SmallChangeSys {

    /**
     * @param args
     * 1.先完成显示菜单，并可以选择菜单，给出相应的提示
     */
    public static void main(String[] args) {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        do {
            System.out.println("==========零钱通菜单==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消    费");
            System.out.println("\t\t4 退    出");

            System.out.print("请选择（1-4）: ");
            key = scanner.next();

            //使用switch 分支控制
            switch (key){
                case "1":
                    System.out.println("1 零钱通明细");
                    break;
                case "2":
                    System.out.println("2 收益入账");
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
