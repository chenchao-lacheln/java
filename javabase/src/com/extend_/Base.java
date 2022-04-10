package com.extend_;

public class Base {//父类
    //四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //无参构造器
    public Base() {
        System.out.println("父类base()的构造器被调用-----");
    }

    //编写一个有参构造器
    public Base(String name,int ade){
        System.out.println("父类Base(String name,int ade)的构造器被调用-----");
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
