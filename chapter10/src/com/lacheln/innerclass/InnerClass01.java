package com.lacheln.innerclass;

public class InnerClass01 {//外部其他类
    public static void main(String[] args) {

    }
}
class Outer{//外部内
    private int n1 = 1;//属性

    public Outer(int n1) {//构造器
        this.n1 = n1;
    }
    {//代码块
        System.out.println("代码块");
    }
    public void hi(){//方法
        System.out.println("hi()");
    }
    class Inner{//内部类，在Outer类的内部

    }
}
