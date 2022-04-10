package com.extend_;

//大学生类 ->模拟大学生类的考试情况
public class Graduate {
    public String name;
    public int age;
    private double score;

    //设置成绩
    public void setScore(double score) {
        this.score = score;
    }

    //考试
    public void testing(){//和Pupil不一样
        System.out.println("大学生" + name + "正在考大学数学。。");
    }

    //展示分数
    public void showInfo(){
        System.out.println("大学生名为 = " + name + "\t年龄 = " + age + "\t分数 = " + score);
    }
}
