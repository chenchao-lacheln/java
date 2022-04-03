package com.chapter.seventh;

public class Constructor01 {
    public static void main(String[] args) {
        Person01 test1 = new Person01("lacheln",25);
        System.out.println("初始化信息如下");
        System.out.println("姓名 = " + test1.name);
        System.out.println("年龄 = " + test1.age);

    }
}

class Person01 {
    String name;
    int age;
    /*
    构造器
    1.构造器没有返回值，也不能写void
    2.构造器的名称和类的Person01一样
    3.（String pName,int pAge）是构造器的形参列表，规则和成员方法一样
     */
    public Person01(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}