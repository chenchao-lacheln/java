package com.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C1 c1 = new C1();
    }
}

class A1 {
    public A1(){
        System.out.println("我是A1类");
    }
}
class B1 extends A1 {
    public B1(){
        System.out.println("我是B1的无参构造器");
    }
    public B1(String name){
        //这里有一个默认的super();
        System.out.println(name + "我是B1类的有参构造器");
    }
}
class C1 extends B1{
    public C1(){
        this("hello");
        System.out.println("我是C1的无参构造器");
    }
    public C1(String name){
        super("hahaha");
        System.out.println("我是C类的有参数构造器");
    }
}