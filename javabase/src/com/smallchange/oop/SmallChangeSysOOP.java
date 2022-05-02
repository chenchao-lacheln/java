package com.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通各个功能的类
 * 使用OOP（面向对象编程）
 */
public class SmallChangeSysOOP {

    /**
     * 定义属性
     */
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

//     使用String拼接
    String details = "----------零钱通明细----------";

     //收益入账变量
    double money = 0;
    double balance = 0;
    Date date = null;//date 是 java.util.Date 类型，表示日期
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用户日期格式化

    //消费定义新变量
    String note = "";

    //1.菜单
    public void mainMenu(){
        do {
            System.out.println("\n==========选择零钱通菜单(OOP)==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消    费");
            System.out.println("\t\t4 退    出");

            System.out.print("请选择（1-4）: ");
            key = scanner.next();

            //使用switch 分支控制
            switch (key){
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                   this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重先选择");
            }

        }while (loop);
    }

    //2.零钱通明细
    public void detail(){
        System.out.println(details);
    }

    //3.收益入账
    public void income(){
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        //money的值得范围 需要进行校验
        /**
         * 7.在收益入账和消费时，判断金额是否合理，并给出相应的提示
         * （1）找出不正确的金额条件，然后给出提示,就直接return
         */
        if (money <= 0){
            System.out.println("收益入账金额需要大于0");
            return;//退出方法，不再执行后面的代码
        }
        balance += money;
        //拼接收益入账信息到 details
        date = new Date();//获取当前日期
        details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + "余额:" + balance;
    }

    //4.消费
    public void pay(){
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        //money的值得范围 需要进行校验
        //找到不正确的情况
        if (money <= 0 || money > balance){
            System.out.println("你的消费金额，应该在 0-" + balance);
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        //拼接收益入账信息到 details
        date = new Date();//获取当前日志
        details += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t" + "余额" + balance;
    }

    //5.退出
    public void exit(){
        /**
         * 6.用户输入4退出时，给出提示"你确定要退出吗？y/n" ，必须输入正确的y/n，否则循环输入指令，直到输入y或者n
         */
        String choice = "";
        while (true){//必须输入y/n，否则一直循环
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        //当用户退出while后，进行判断
        if (choice.equals("y")){
            loop = false;
        }
    }
}
