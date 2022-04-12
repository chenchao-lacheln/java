package com.extend_;

/**
 * 继承的本质
 */
public class ExtendTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        /**
         * 注意：以上要按照查找关系来返回信息
         * 1.首先看子类是否有该属性
         * 2.如果子类有这个属性，并且可以访问，则返回信息
         * 3.如果子类没有这个属性，就看父类有没有这个属性（如果父类有该属性，并且可以访问，则返回信息）
         * 4.如果父类没有就按照（3）的规则，继续找上级父类，直到Object...
         * 5.如果Object都没有找到该属性，程序就会报错
         */
        System.out.println(son.name);//返回的就是大头儿子
        System.out.println(son.age);//返回Father中的39
        System.out.println(son.hobby);//返回GrandPa中的旅行
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