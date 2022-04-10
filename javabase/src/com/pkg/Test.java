package com.pkg;

import com.modifier.A;

public class Test {
    public static void main(String[] args) {
        //不同包 只能访问public修饰的属性或方法，不能访问protected 默认 private修饰的属性或方法
        A a = new A();
        System.out.println("n1 = " + a.n1);

        //不同包 只能访问public修饰的属性或方法
        a.m1();
        //不能访问a.m2() a.m3() a.m4()
    }
}
