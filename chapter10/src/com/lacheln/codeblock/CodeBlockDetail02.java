package com.lacheln.codeblock;

/**
 * 创建一个对象，在【一个类】中的调用顺序
 * 1.静态属性和方法：根据定义顺序进行调用
 * 2.普通属性和方法：根据定义顺序进行调用
 * 3.构造器
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();//(1)getN1() 被调用...(2)A 静态代码块 01 (3)getN2() 被调用...
        // (4)A 普通代码块 01(5)A构造器被调用
    }
}

class A {
    //静态属性
    private static int n1 = getN1();
    //普通属性
    private int n2 = getN2();

    {//普通代码块
        System.out.println("A 普通代码块 01");
    }
    static {//静态代码块
        System.out.println("A 静态代码块 01");
    }

    public static int getN1(){
        System.out.println("getN1() 被调用...");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2() 被调用...");
        return 200;
    }

    //无参构造器
    public A(){
        System.out.println("A构造器被调用");
    }
}