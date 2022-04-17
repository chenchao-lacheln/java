package com.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A {
    A(){
        System.out.println("a");
    }

    A(String name){
        System.out.println("a name");
    }
}

class B extends A{
    B(){
        this("abc");//有this就不会有super()；
        System.out.println("b");
    }
    B(String name){
//        super();//这里有一个隐藏的super();会调用父类的无参构造器
        System.out.println("b name");
    }
}
