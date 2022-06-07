package com.lacheln.homework;

/**
 * Homework03
 *
 * @author lacheln
 * @date 2022/5/23 02:03
 * @since 1.0.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}
//动物类
abstract class Animal {
    //抽象方法Shout()
    abstract void shout();
}

class Cat extends Animal{
    @Override
    void shout() {
        System.out.println("猫会喵喵叫...");
    }
}

class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("狗会汪汪叫...");
    }
}