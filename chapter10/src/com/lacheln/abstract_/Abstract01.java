package com.lacheln.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考：这里eat，你实现了，其实也没什么意义
    //即，父类方法不确定问题
    //===>>考虑将该方法设计成抽象方法
    //===>>所谓抽象方法，就是没有实现的方法
    //===>>所谓没有实现，就是没有方法体
    //===>>当一个类中存在抽象方法时，需要将改类声明为abstract类
    //===>>一般来说，抽象类会被继承，由其子类来实现抽象方法
//    public void eat(){
//        System.out.println("这是一个动物，但是还不知道吃什么...");
//    }
    public abstract void eat();//申明为抽象方法后，类也需要声明为抽象类
}