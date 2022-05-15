package com.lacheln.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.9);
        System.out.println("面积 = " + circle.calArea());

    }
}

class Circle {
    private double radius;
    private final double PI;// = 3.14;

    //构造器
    public Circle(double radius) {
        this.radius = radius;
        //PI = 3.14;
    }
    //代码块
    {
        PI = 3.14;
    }

    //圆面积
    public double calArea(){
        return PI * radius * radius;
    }
}
