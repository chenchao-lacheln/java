package com.extend_;

public class Base {//父类
    //四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //无参构造器
    public Base() {
        System.out.println("父类Base()的构造器被调用-----");
    }

    //父类没有指定默认构造器
    //第一个有参构造器
    public Base(String name,int age){
        System.out.println("父类Base(String name,int age)的构造器被调用-----");
    }

    //第二个有参构造器
    public Base(String name){
        System.out.println("父类Base(String name)的构造器被调用-----");
    }
    //父类提供一个public的方法，返回n4
    public int getN4(){
        return n4;
    }
//    四个方法
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }

    //call调用
    public void callTest400(){
        test400();
    }

}
