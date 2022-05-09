package com.lacheln.main;


//在idea传递动态参数
public class Main02 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数  = " + args[i]);
        }
    }
}
