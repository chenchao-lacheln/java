package com.extend_;

//小学生->模拟小学生考试情况
public class Pupil {
    public String name;
    public int age;
    private double score;

    //设置成绩
    public void setScore(double score) {
        this.score = score;
    }

    //考试
    public void testing(){
        System.out.println("小学生" + name + "正在考小学数学。。");
    }

    //展示分数
    public void showInfo(){
        System.out.println("小学生姓名为 = " + name + "\t年龄 = " + age + "\t分数 = " + score);
    }
}
