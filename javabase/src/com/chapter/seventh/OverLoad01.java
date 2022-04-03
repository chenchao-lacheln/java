package com.chapter.seventh;

public class OverLoad01 {
    public static void main(String[] args) {
        MyCalculate mc = new MyCalculate();
        //跟进实参的类型进行自动匹配
        System.out.println(mc.calculate(1,2));
        System.out.println(mc.calculate(1.1,2));
    }
}
class MyCalculate {
    //下面的四个方法构成了重载
    public int calculate(int n1 , int n2){
        return n1 + n2;
    }
    public double calculate(int n1 , double n2){
        return n1 + n2;
    }
    public double calculate(double n1 , int n2){
        return n1 + n2;
    }
    public int calculate(int n1 , int n2 , int n3){
        return n1 + n2 + n3;
    }
}

/*
3
3.1
 */