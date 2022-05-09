package com.lacheln.static_;

public class StaticMethodDetails {
    public static void main(String[] args) {
        D.hi();
        //非静态方法，不能通过类名直接进行调用
        //D().say();错误，需要先创建对象，再调用
        new D().say();
    }
}

class D {
    public int n1 = 0;
    public static double n2 = 0;

    public void say(){//非静态方法

    };
    public static void hi(){//静态方法
        //类方法中不允许使用和对象有关的关键字，
        // 比如this super，普通方法（成员方法）可以
//        System.out.println(this.n1);
    };

    //类方法只能访问静态变量和静态方法
    //口诀：静态方法只能访问静态成员
    public static void hello(){
        System.out.println(n2);
        System.out.println(D.n2);
//        System.out.println(this.n2);不能使用
        hi();
//        say();错误
    }

    //普通成员方法，既可以访问 非静态成员 也可以访问静态成员
    public void ok(){
        //非静态成员
        System.out.println(n1);
        say();
        //静态成员
        System.out.println(n2);
        hi();
    }
}

