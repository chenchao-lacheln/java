package com.extend_;

public class ExtendDetail {
    public static void main(String[] args) {

        //子类必须调用父类的构造器，完成父类初始化
        System.out.println("=====第一个对象=====");
        Sub sub = new Sub();//创建子类对象 sub
//        sub.sayOk();

        System.out.println("=====第二个对象=====");
        Sub sub1 = new Sub("lacheln");//创建子类对象 sub1

        System.out.println("=====第三个对象=====");
        Sub sub2 = new Sub("king",10);
        /**
         =====第三个对象=====
         父类Base()的构造器被调用a-----
         子类Sub(String name,int age)构造器被调用-----
         */

    }
}
