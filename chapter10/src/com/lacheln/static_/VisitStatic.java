package com.lacheln.static_;

public class VisitStatic {
    public static void main(String[] args) {

        //类名.类变量名
        //说明：类名是随着类的加载而创建的，所以即使没有创建对象实例，也可以访问
        System.out.println(A.name);

        //创建实例对象访问
        A a = new A();
        //通过对象名.类变量名
        System.out.println("a.name = " + a.name);
    }
}

class A{
    //类变量
    //类变量的访问，必须遵守相关访问权限
    public static String name = "lacheln";

    //普通属性/普通成员变量/非静态成员变量/非静态属性/实例变量
    public int nums = 10;
}
