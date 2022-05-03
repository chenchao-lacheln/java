package com.homework;

/*
多态：方法或者对象具有多种形态，是OOP的第三大特征，是建立在封装和继承基础之上的
多态的体现：
1.方法多态
    1.1重载体现多态
    1.2重写体现多仁爱
2.对象多态
    2.1对象的编译类型和运行类型可以不一致，编译类型在定义时，就确定，不能变化
    2.2对象的运行类型是可以变化的，可以通过getClass()查看运行类型
    2.3编译类型看定义时 = 的左边，运行类型看定义时 = 的右边
3.举例说明2.2
 */
public class Homework15 {
    //演示2.2
    public static void main(String[] args) {
        AAA aaa = new BBB();//向上转型
        AAA aaa1 = aaa;
        System.out.println("aaa的运行类型 = " + aaa.getClass());//BBB
        aaa = new CCC();//向上转型
        System.out.println("aaa的运行类型 = " + aaa.getClass());//CCC
        aaa = aaa1;
        System.out.println("aaa的运行类型 = " + aaa.getClass());//BBB
    }
}

//超类
class AAA{

}
//父类
class BBB extends AAA{

}
//子类
class CCC extends BBB{

}