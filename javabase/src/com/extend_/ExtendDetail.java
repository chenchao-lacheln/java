package com.extend_;

public class ExtendDetail {
    public static void main(String[] args) {

        //子类必须调用父类的构造器，完成父类初始化
        Sub sub = new Sub();//创建子类对象 sub
        /**
         * 父类和子类的构造器都被调用了（子类sub中默认有个super();会默认调用父类的构造器）
         * 父类base()的构造器被调用-----
         * 子类Sub()构造器被调用-----
         */
//        sub.sayOk();

        //当创建子类对象时，不管使用子类哪个构造器，默认情况下总会去调用父类的无参构造器
        System.out.println("=====第二个对象=====");
        Sub sub1 = new Sub("lacheln");//创建子类对象 sub1

        /**
         * 父类base()的构造器被调用-----
         * 子类Sub()构造器被调用-----
         * =====第二个对象=====
         * 父类base()的构造器被调用-----
         * 字类Sub(String name)构造器被调用-----
         */

    }
}
