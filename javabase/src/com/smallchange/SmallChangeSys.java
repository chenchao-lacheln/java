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
     * 4.消费
     * 5.退出
     * 6.用户输入4退出时，给出提示"你确定要退出吗？y/n" ，必须输入正确的y/n，否则循环输入指令，直到输入y或者n
     * 7.在收益入账和消费时，判断金额是否合理，并给出相应的提示
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

        /**
         * 4.消费
         * （1）定义新变量，保存消费原因
         */

        String note = "";
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
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    //money的值得范围 需要进行校验
                    /**
                     * 7.在收益入账和消费时，判断金额是否合理，并给出相应的提示
                     * （1）找出不正确的金额条件，然后给出提示,就直接break
                     */
                    if (money <= 0){
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到 details
                    date = new Date();//获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + "余额:" + balance;

                    break;
                case "3":
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    //money的值得范围 需要进行校验
                    //找到不正确的情况
                     if (money <= 0 || money > balance){
                         System.out.println("你的消费金额，应该在 0-" + balance);
                         break;
                     }
                    System.out.print("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    //拼接收益入账信息到 details
                    date = new Date();//获取当前日志
                    details += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t" + "余额" + balance;
                    break;
                case "4":
                    /**
                     * 6.用户输入4退出时，给出提示"你确定要退出吗？y/n" ，必须输入正确的y/n，否则循环输入指令，直到输入y或者n
                     * （1）定义一个变量choice，接收用户输入
                     * （2）使用while + break 死循环，不停的提示输入，直到输入的值为 y 或者 n
                     * （3）退出while后，再判断choice是Y 还是n，来决定是否退出
                     * （4）一段代码，完成一个小功能，最好不要混合在一起
                     */
                    String choice = "";
                     while (true){//必须输入y/n，否则一直循环
                         System.out.println("你确定要退出吗？y/n");
                         choice = scanner.next();
                         if ("y".equals(choice) || "n".equals(choice)){
                             break;
                         }

                         //尽力减少代码耦合性
//                         if ("y".equals(choice)){
//                             loop = false;
//                             break;
//                         }else if ("n".equals(choice)){
//                             break;
//                         }
                     }
                     //当用户退出while后，进行判断
                    if (choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重先选择");
            }

        }while (loop);

        System.out.println("=========退出了零钱通项目==========");
    }
}
