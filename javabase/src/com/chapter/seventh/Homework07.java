package com.chapter.seventh;

public class Homework07 {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财\t","红色\t",98);
        dog.show();
    }
}
/*
设计一个Dog类，有名字，颜色，年龄属性，定义输出方法show（）显示其信息，并创建对象进行测试【this。属性】
 */

class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println("狗的名字 = " + name + "狗的颜色 = " + color + "狗的年龄 = " + age);
    }
}