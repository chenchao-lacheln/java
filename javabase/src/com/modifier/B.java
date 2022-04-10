package com.modifier;

public class B {
    public void say(){
        A a = new A();
        //在同一个包下，可以访问public protected 和默认修饰属性和方法 不能访问private属性和方法
        System.out.println("n1 = " + a.n1 + "\tn2 = " + a.n2 + "\tn3 = " + a.n3);

        //在同一个包下，可以访问public protected 和默认修饰属性和方法 不能访问private属性和方法
        a.m1();
        a.m2();
        a.m3();
//        a.m4();错误
    }
}
