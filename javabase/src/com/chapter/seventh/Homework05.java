package com.chapter.seventh;

public class Homework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("当半径 = " + circle.redius + "时");
        System.out.println("周长 = " + circle.perimeter());
        System.out.println("面积 = " + circle.area());
    }
}
//定义一个圆类Circle，定义属性：半径，提供显示圆周长的方法，提供显示圆面积的方法
class Circle{
    double redius;
    public Circle(double redius){
        this.redius = redius;
    }
    //周长
    public double perimeter(){
        return 2 * Math.PI * redius;
    }
    //面积
    public double area(){
        return Math.PI * redius * redius;
    }
}
