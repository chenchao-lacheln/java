package com.chapter.seventh;

public class ConstructorExercise01 {
    public static void main(String[] args) {
        Person02 con1 = new Person02();
        System.out.println("第一个构造器的默认信息如下");
        System.out.println("age = " + con1.age);
        System.out.println("age = " + con1.name);

        Person02 con2 = new Person02("lacheln",25);
        System.out.println("第二个构造器的默认信息如下");
        System.out.println("age = " + con2.age);
        System.out.println("name = " + con2.name);

    }
}

class Person02 {
    String name;
    int age;

    //带pName和pAge两个参数的构造器
    public Person02(String pName,int pAge){
        name = pName;
        age = pAge;
    }

    //无参构造器
    public Person02(){
        age = 18;
    }
}

/*
第一个构造器的默认信息如下
age = 18
age = null
第二个构造器的默认信息如下
age = 25
name = lacheln
 */