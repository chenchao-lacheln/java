package com.homework;

public class Homework11 {
    public static void main(String[] args) {
        //向上转型,父类引用指向之类的对象
        Person1 person1 = new Student();
        //person1的编译类型是person1，所以在写代码的时候，编译器只会去person1中找， 运行的时候才会去人运行类型Student
        person1.run();//student run
        person1.eat();//person eat
        //向下转型：把指向子类对象的父类引用，转成指向子类对象的子类引用
        Student student = (Student) person1;
        student.run();//student run
        student.eat();//person1 eat
        student.study();//student study

    }
}

class Person1{
    public void run(){
        System.out.println("person run");
    }
    public void eat(){
        System.out.println("person eat");
    }
}

class Student extends Person1{
    public void run(){
        System.out.println("student run");
    }
    public void study(){
        System.out.println("student study");
    }
}
