package com.extend_.improve_;

//父类，是Pupil和Graduate的父类
public class Student {
    //公共属性
    public String name;
    public int age;
    private double score;

    //公共方法
    //设置成绩
    public void setScore(double score) {
        this.score = score;
    }
    //展示分数
    public void showInfo(){
        System.out.println("大学生名为 = " + name + "\t年龄 = " + age + "\t分数 = " + score);
    }
}
