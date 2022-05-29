package com.lacheln.exception_;

/**
 * ClassCaseException_
 *
 * @author lacheln
 * @date 2022/5/29 13:07
 * @since 1.0.0
 */
public class ClassCaseException_ {
    public static void main(String[] args) {
        A b = new B();//向上转型
        B b1 = (B)b;//向下转型
        C c = (C)b;//ClassCaseException
    }
}

class A{}
class B extends A{}
class C extends A{}