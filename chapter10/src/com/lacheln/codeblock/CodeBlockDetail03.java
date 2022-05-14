package com.lacheln.codeblock;

/**
 * 构造器里面的执行顺序
 * 1.super()
 * 2.普通代码块
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();//匿名对象(1)AAA的普通代码块 （2）AAA() 构造器被调用....(3)BBB()的普通代码快...(4)BBB() 构造器被调用....
    }
}
class AAA {
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        // （1）隐藏的super()
        // （2）调用本类的普通代码块
        System.out.println("AAA() 构造器被调用....");
    }
}

class BBB extends AAA{


    {
        System.out.println("BBB()的普通代码快...");
    }
    public BBB() {
        super();
        //（1）隐藏的super()
        // （2）调用本类的普通代码块
        System.out.println("BBB() 构造器被调用....");
    }
}
