package com.polymorphic.polyarr_;

public abstract class PolyArray {
    public static void main(String[] args) {
        //应用实例：现在有一个继承结构如下：要求创建一个Person对象、2个Student对象、2个Teacher对象，
        //统一放在数组中，并调用每个对象的say方法

        //父类的引用可以指向子类的对象，Person以及Person的子类对象，都可以放
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("jack",18,100);
        persons[2] = new Student("smith",19,30.1);
        persons[3] = new Teacher("scott",30,20000);
        persons[4 ] = new Teacher("king",50,25000);

        //循环遍历多态数组，调用say方法
        for (int i = 0;i < persons.length;i++){
            //persons[i]编译类型是 Person ，运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
        }
    }
}
