package com.homework;

public class Homework09 {
    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("Black", 1929, 230.07);
    }
}

class Point{
    private double X;
    private double Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }
}

class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(String label,double x, double y) {
        super(x, y);
        this.label = label;
    }
}