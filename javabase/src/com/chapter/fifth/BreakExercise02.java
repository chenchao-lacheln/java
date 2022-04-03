package com.chapter.fifth;

import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {
         Scanner myScanner = new Scanner(System.in);
         String userName = "";
         String password = "";
         int chance = 3;
         for (int i = 1;i <= 3;i++){
             System.out.println("请输入用户名：");
             userName = myScanner.next();
             System.out.println("请输入用密码：");
             password = myScanner.next();
             if ("丁真".equals(userName) && "666".equals(password)){
                 System.out.println("登录成功！");
                 break;
             }
             chance--;
             System.out.println("您还有" + chance + "次机会！");
         }
    }

}
