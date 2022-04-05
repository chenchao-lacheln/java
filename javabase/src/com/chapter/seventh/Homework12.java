package com.chapter.seventh;

public class Homework12 {
    public static void main(String[] args) {

    }
}

class Employee{
    String name;
    char gender;
    int age;
    String job;
    double sal;
    //职位 薪水
    public Employee(String job,double sal){
        this.job = job;
        this.sal = sal;
    }
    //名字 性别 年龄
    public Employee(String name,char gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //职位 薪水 名字 性别 年龄
    public Employee(String job,double sal,String name,char gender,int age){
        this(name, gender, age);//复用构造器
        this.job = job;
        this.sal = sal;
    }
}