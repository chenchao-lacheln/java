package com.extend_;


//输入command + h  可以看到类的继承关系
public class Sub extends Base{//子类

    //有参构造器
    public Sub(String name,int age){
        //1.调用父类的无参构造器如下，或者 什么都不写 默认调用 super();
//        super();//父类的无参构造器
        //2.调用父类的Base(String name)构造器
        super("超哥");
        System.out.println("子类Sub(String name,int age)构造器被调用-----");

    }

    public Sub() {//构造器
//        super();// 默认调用父类的无参构造器（打比方：人出生了就会默认有个身份证））
//        这里会默认有个super(); 调用父类的午餐构造器

        //父类没有指定默认构造器，子类必须在构造器中用super("lacheln",23);完成对父类的初始化工作。
        super("lacheln",23);
        System.out.println("子类Sub()构造器被调用-----");
    }

    //当创建子类对象时，不管使用子类哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name){
        super("Tom",30);
        //do nothing....
        System.out.println("字类Sub(String name)构造器被调用-----");
    }

    public void sayOk(){//子类方法
        //非私有的private属性和方法 可以在子类进行访问
        //但是私有的属性和方法不能在子类中直接访问
        System.out.println(n1 + n2 + n3); //n4无法进行访问输出，n4是private属性
        test100();
        test200();
        test300();
//        test400(); test400是私有方法，无法访问

        //通过父类提供的公共方法去访问
        System.out.println("n4 = " + getN4());
        callTest400();
    }
}
