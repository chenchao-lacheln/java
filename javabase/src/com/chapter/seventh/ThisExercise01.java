package com.chapter.seventh;

public class ThisExercise01 {
    public static void main(String[] args) {
        Person05 p1 = new Person05("lacheln",23);
        Person05 p2 = new Person05("lacheln",23);
        System.out.println("p1和p2比较的结果 = " + p1.compareTo(p2));

    }
}

class Person05 {
    String name;
    int age;
    //构造器
    public Person05(String name,int age){
        this.name = name;
        this.age = age;
    }

    //比较方法
    public boolean compareTo(Person05 p){
//        if (this.name.equals(p.name) && this.age == p.age){
//            return true;
//        }else {
//            return false;
//        }
        //上面代码可以简化成为如下代码
        return this.name.equals(p.name) && this.age == p.age;
    }
}
