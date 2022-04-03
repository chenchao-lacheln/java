package com.chapter.seventh;

public class Homework06 {
    public static void main(String[] args) {
        Cale cale = new Cale(8,0);
        cale.maltiplication();
        System.out.println("乘 = " + cale.maltiplication());
        System.out.println("加 = " + cale.addition());
        System.out.println("减 = " + cale.subtraction());

        Double divRes = cale.division();
        if (divRes != null){
            System.out.println("除 = " + cale.division());
        }
    }
}
/*
编程创建一个Cale计算机类，定义两个变量表示操作数，
定义四个方法求和、差、乘、商（要求除数为0的的话，需要提示），
并创建2个对象，分别测试
 */
class Cale {
    double firstNums;
    double secondNums;

    public Cale(double firstNums, double secondNums) {
        this.firstNums = firstNums;
        this.secondNums = secondNums;
    }

    //乘法
    public double maltiplication() {
        return firstNums * secondNums;
    }

    //加法
    public double addition() {
        return firstNums + secondNums;
    }

    //减法
    public double subtraction() {
        return firstNums - secondNums;
    }

    //除法
    public Double division() {
        if (secondNums == 0) {
            System.out.println("被除数不能为0！");
            return null;
        } else {
            return firstNums / secondNums;
        }
    }
}