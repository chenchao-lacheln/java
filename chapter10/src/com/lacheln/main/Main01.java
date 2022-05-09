package com.lacheln.main;

public class Main01 {

    private static String name = "lacheln";
    private int n1 = 0;


    public static void hi(){

    }

    public void hello(){

    }

    public static void main(String[] args) {
        //1.静态方法可以访问本类的静态成员,可以直接使用name
        System.out.println("name = " + name);
        hi();

        //2.静态方法main，不可以访问本类的非静态成员
        //System.out.println("n1 = " + n1);错误
        //hello();错误

        //3.静态方法main 要访问本类的非静态成员,需要先创建对象，在进行调用
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.hello();
    }
}
