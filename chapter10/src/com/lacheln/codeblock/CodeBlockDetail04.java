package com.lacheln.codeblock;

/**
 * 创建一个子类对象时（继承关系，静态代码亏啊，静态属性初始化，普通代码块，普通属性初始化，构造器，调用顺序
 * 1.父类的静态代码块和静态属性（优先级一样，按定义顺序执行）
 * 2.子类的静态代码块和静态属性（优先级一样，按定义顺序执行）
 * 3.父类的普通代码块和普通属性（优先级一样，按定义顺序执行）
 * 4.父类的构造方法
 * 4.子类的普通代码块和普通属性（优先级一样，按定义顺序执行）
 * 5.子类的构造方法
 */
public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //创建B02()这个对象的时候，首先要做什么事情
        //（1）进行类的加载
        //1.1 先加载 父类 A02
        //1.2 再加载 B02
        //（2）创建对象
        new B02();
    }
}
class A02 {//父类
    private static int n1 = getVal01();
    static {
        System.out.println("A02的第一个静态代码块...");//(2)
    }
    {
        System.out.println("A02的第一个普通代码块...");//(5)
    }

    public int n3 = getVal02();
    public static int getVal01(){
        System.out.println("getVal01");//(1)
        return 10;
    }

    public int getVal02(){
        System.out.println("getVal02");//(6)
        return 10;
    }

    //无参构造器
    public A02() {
        //隐藏了
        //super
        //普通代码块和普通属性的初始化...
        System.out.println("A02的无参构造器");//(7)
    }
}

class B02 extends A02{
    private static int n3 = getVal03();
    static {
        System.out.println("B02的第一个静态代码块...");//(4)
    }
    public int n5 = getVal04();
    {
        System.out.println("B02的第一个普通代码块...");//(9)
    }
    public static int getVal03(){
        System.out.println("getVal03");//(3)
        return 10;
    }

    public int getVal04(){
        System.out.println("getVal05");//(8)
        return 10;
    }
    //无参构造器
    public B02() {
        //隐藏了
        //super
        //普通代码块和普通属性的初始化...
        System.out.println("B02的无参构造器");//(10)
    }
}

/**
 * 静态代码快只能调用静态成员，普通代码块可以调用任意成员
 */
class C02 {
    private int n1 = 100;
    private static int n2 = 200;

    private void m1(){

    }

    private static void m2(){

    }

    static {
        //静态代码块只能调用静态成员
        System.out.println(n2);//只能调用n2静态属性
        m2();//只能调用m2静态方法
    }

    {
        //普通代码块可以调用任意成员
        System.out.println(n1 + n2);//静态属性和普通属性都可以调用
        m1();//调用普通方法
        m2();//调用静态方法
    }
}