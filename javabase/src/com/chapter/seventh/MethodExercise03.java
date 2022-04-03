package com.chapter.seventh;

public class MethodExercise03 {
    public static void main(String[] args) {
        Person04  p =new Person04();
        p.name = "lacheln";
        p.age = 25;

        //创建一个tools对象
        MyTools03 tools = new MyTools03();
        Person04 p2 = tools.copyPerson(p);

        //到此p和p1s是Person对象，但是是两个独立的对象，属性相同
        System.out.println("p的属性 name = " + p.name + " age = " + p.age);
        System.out.println("p2的属性 name = " + p2.name + " age = " + p2.age);
        //这里老师提示：可以同对象比较看看是否为同一个对象
        System.out.println(p == p2); //false
    }
}

class Person04{
    String name;
    int age;
}
//编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象，
//注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
/*
编写思路
1.方法的返回类型：Person
2.方法的名称：copyPerson
3.方法的形参：(Person b)
4.方法体，创建一个新的对象，并复制属性，返回即可
 */

class MyTools03{
    public Person04 copyPerson(Person04 p){
//        创建一个新的对象
        Person04 p2 = new Person04();
        p2.name = p.name;//把原来对象的名字赋给p2.name
        p2.age = p.age;//把原来对象的年龄赋给p2.age

        return p2;
    }
}