package com.chapter.fifth;

public class Homework01 {
    public static void main(String[] args) {
        double money = 100000;
        int count = 0;
        while (true){
            if(money > 50000){
//                money = money - money * 0.05;
                money *= 0.95;
                count++;
            }else if (money >= 1000 && money < 50000){ // && money < 50000可以省略
                money -= 1000;
                count++;
            }else {
                break;
            }
        }
        System.out.println("100000元可以过" + count + "个路口");
    }
}
