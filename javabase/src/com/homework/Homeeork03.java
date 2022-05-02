package com.homework;

public class Homeeork03 {
    public static void main(String[] args) {
        new Professor("jack",12,"哈哈",10000,1.3).introduce();
        new AssProfessor("lacheln",40,"滴滴",20000,1.2).introduce();
        new Lecturer("marry",30,"看看",30000,1.1).introduce();
    }
}

class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    //增加一个工资级别
    private double grade;

    public Teacher(String name, int age, String post, double salary,double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void introduce(){
        System.out.println("姓名：" + name + "\t年龄：" + age
                + "\t职称：" + post + "\t薪资：" + salary + "\t职级" + grade);
    }
}

//教授类
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}
//副教授类
class AssProfessor extends Teacher{
    public AssProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是副教授的信息");
        super.introduce();
    }
}
//讲师类
class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce() {
        System.out.println("这是讲师的信息");
        super.introduce();
    }
}
