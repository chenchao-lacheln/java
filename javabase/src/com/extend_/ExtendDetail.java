package com.extend_;

public class ExtendDetail {
    public static void main(String[] args) {

        //子类必须调用父类的构造器，完成父类初始化
        Sub sub = new Sub();//创建子类对象 sub
        /**
         * 父类和子类的构造器都被调用了（子类sub中默认有个super();会默认调用父类的构造器）
         * 子类base()的构造器被调用-----
         * 父类Sub()构造器被调用-----
         */
//        sub.sayOk();
    }
}
