package com.chapter.seventh;

public class OverLoadExercise01 {
    public static void main(String[] args) {
        Methods method = new Methods();
        method.m(10);
        method.m(4,3);
        method.m("Hello World");

        //测试
        System.out.println(method.max(10,20));
        System.out.println(method.max(10.1,20.1));
        System.out.println(method.max(10.1,20.1,30.1));
    }
}

class Methods {
    public void m(int n1){
        System.out.println("平方 = " + (n1 * n1));
    }
    public void m(int n1,int n2){
        System.out.println("相乘 = " + (n1 * n2));
    }
    public void m(String n1){
        System.out.println("传入的str = " + n1);
    }

    public int max(int a1,int a2){
        return a1 > a2 ? a1 : a2;
    }
    public double max(double a1,double a2){
        return a1 > a2 ? a1 : a2;
    }

    public double max(double a1,double a2,double a3){
        double max1 = a1 > a2 ? a1 : a2;
        return max1 > a3 ? max1 : a3;
    }
}

