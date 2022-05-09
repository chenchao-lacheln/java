package com.lacheln.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {

        //类加载情况距离
        //1，创建对象实例时（new）
//        AA aa = new AA();//AA的静态代码块被执行。。。
        //2.创建子类对象实例，父类也会被加载(继承的本质是先加载父类，再加载子类)
//        AA aa1 = new AA();//BB的静态代码块被执行。。。AA的静态代码块被执行。。。
        //3.使用类的静态成员时（静态属性，静态方法）
//        System.out.println(Cat.n1);

        //4.创建了2个对象，但是DD()类只是被加载了一次,所以static也只会被加载1次
        //5.static代码块,是在类加载时执行的,而且只会执行1次
//        DD dd = new DD();
//        DD dd1 = new DD();//DD的静态代码块被执行。。。
        //6.普通代码块  会被执行2次
//        DD dd = new DD();//DD的静态代码块被执行。。。
//        DD dd1 = new DD();//DD的静态代码块被执行。。。

        //7.普通代码块，在创建对象实例时，会被隐式调用，
        // 被创建一次，就被调用一次，
        // 如果只是使用的静态成员时，普通代码块并不会执行
        System.out.println(DD.n1);//111,静态模块一定会执行，普通代码块不执行
    }
}
class Animal {
    //静态代码块
    static {
        System.out.println("Animal的静态代码块被执行。。。");
    }
}
class Cat extends Animal{
    public static int n1 = 0;

    //静态代码块
    static {
        System.out.println("Cat的静态代码块被执行。。。");
    }
}

class BB  {//父类
    //静态代码块
    static {
        System.out.println("BB的静态代码块被执行。。。");
    }
}

class AA extends BB{//子类
    //静态代码块
    static {
        System.out.println("AA的静态代码块被执行。。。");
    }
}

class DD  {//父类
    public static int n1 = 111;
    //静态代码块
    static {
        System.out.println("DD的静态代码块被执行。。。");
    }
    //普通代码块，在new对象时，被调用,而且是每创建1个对象就调用1次，
    {
        System.out.println("DD的普通代码块被执行。。。");
    }
}