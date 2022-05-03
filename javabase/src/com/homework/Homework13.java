package com.homework;

public class Homework13 {
    public static void main(String[] args) {
        Person2[] person2s = new Person2[4];
        //测试打印学生信息
        Student1 student1 = new Student1("测试", 23, '女', "007");
        student1.printInfo();

        //测试打印老师信息
        System.out.println("============================");
        Teacher2 teacher2 = new Teacher2("开发", 40, '男', 12);
        teacher2.printInfo();

        //使用多态数组进行排序
        person2s[0] = new Student1("超超", 99, '男', "001");
        person2s[1] = new Student1("刘备", 34, '女', "002");
        person2s[2] = new Teacher2("张飞", 45, '女', 15);
        person2s[3] = new Teacher2("关于", 18, '男', 3);

        System.out.println("排序前的效果");
        for (int i = 0; i < person2s.length; i++) {
            System.out.println(person2s[i]);
        }
        Tools tools = new Tools();
        tools.bubbleSrot(person2s);
        System.out.println("排序后的效果");
        for (int i = 0; i < person2s.length; i++) {
            System.out.println(person2s[i]);
        }

        //定义方法，形参为Person类型，功能：调用学生的study或者老师teach方法
        //遍历数据 调用test方法
        System.out.println("============================");
        for (int i = 0; i < person2s.length; i++)     {
            tools.test(person2s[i]);
        }
    }
}
//父类
class Person2{
    //姓名 年龄 性别
    private String name;
    private int age;
    private char sex;

    public Person2(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    //都有玩的方法，在父类中进行封装
    public String play(){
        return name + "爱玩";
    }

    //返回一个基本信息
    public String basicInfo(){
        return "姓名："  + name + "\n年龄：" + age + "\n性别：" + sex;
    }

    //重写toString 方法
    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

//学生
class Student1 extends Person2{
    //学号
    private String stu_id;

    public Student1(String name, int age, char sex, String stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    //学习方法
    public void study(){
        System.out.println(getName() + "承诺，我会好好学习！");
    }

    //重写play
    @Override
    public String play() {
        return getName() + " 爱玩足球";
    }

    //编写输出信息的方法
    public void printInfo(){
        System.out.println("学生的信息：");
        System.out.println(super.basicInfo());
        System.out.println("学号：" + stu_id);
        study();
        System.out.println(play());
    }

    //重写学生toString方法
    @Override
    public String toString() {
        return "Student1{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}
//老师
class Teacher2 extends Person2{
    //工龄
    private int work_age;

    public Teacher2(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    //教学方法
    public void teach(){
        System.out.println(getName() + "承诺，我会认真教学");
    }

    //重写play
    @Override
    public String play() {
        return getName() + " 爱玩象棋";
    }

    //编写输出信息的方法
    public void printInfo(){
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + work_age);
        teach();
        System.out.println(play());
    }

    //重写老师toString方法
    @Override
    public String toString() {
        return "Teacher2{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}

class Tools{

    //按照年龄从到低进行排序
    public void bubbleSrot(Person2[] person2s){
        //定义临时变量
        Person2 temp = null;
        for (int i = 0; i < person2s.length - 1; i++) {//外层循环
            for (int j = 0; j < person2s.length - 1 -i; j++) {//内层循环
                if (person2s[j].getAge() < person2s[j + 1].getAge()){
                    temp = person2s[j];
                    person2s[j] = person2s[j + 1];
                    person2s[j + 1] = temp;
                }
            }
        }
    }

    ////定义方法，形参为Person类型，功能：调用学生的study或者老师teach方法
    public void test(Person2 person2){
        //向下转型
        if (person2 instanceof Student1){
            ((Student1)person2).study();
        }else if (person2 instanceof Teacher2){
            ((Teacher2) person2).teach();
        }else {
            System.out.println("do nothing");
        }
    }
}