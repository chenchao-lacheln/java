package com.extend_;

public class ExtendDetail {
    public static void main(String[] args) {

        //子类必须调用父类的构造器，完成父类初始化
        System.out.println("=====第一个对象=====");
        Sub sub = new Sub();//创建子类对象 sub
//        sub.sayOk();

        System.out.println("=====第二个对象=====");
        Sub sub1 = new Sub("lacheln");//创建子类对象 sub1
        /**
         * =====第一个对象=====
         * 父类Base(String name,int ade)的构造器被调用-----
         * 子类Sub()构造器被调用-----
         * =====第二个对象=====
         * 父类Base(String name,int ade)的构造器被调用-----
         * 字类Sub(String name)构造器被调用-----
         */

    }
}
