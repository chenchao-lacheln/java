package com.extend_;

/**
 * 继承的本质
 */
public class ExtendTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
    }
}
class GrandPa {//爷爷类
    String name = "大头爷爷";
    String hobby = "旅行";
}
class Father extends GrandPa {//父类
    String name = "大头爸爸";
    int age = 39;
}
class Son extends Father {//子类
    String name = "大头儿子";
}