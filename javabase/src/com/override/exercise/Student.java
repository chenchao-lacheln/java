package com.override.exercise;

//继承Person类
public class Student extends Person{
    private int id;
    private double score;
    //构造器
    public Student(String name, int age, int id, double score) {
        super(name, age);//这里会调用父类构造器
        this.id = id;
        this.score = score;
    }
    //定义方法say，返回自我介绍信息
    public String say(){
        return super.say() + " id=" + id + " score=" + score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
