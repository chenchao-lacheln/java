package com.homework;

public class Homework10 {
    public static void main(String[] args) {

        //第一个判断，如果传进来的对象就是当前对象
        Doctor doctor = new Doctor("刘备", 18, "IT", '男', 50000);
        Doctor doctor1 = doctor;
        System.out.println(doctor.equals(doctor1));
        //第三个判断，通过向下转型将传进来的对象指向Doctor或者Doctor的子类，然后通过
        // 引用当前对象的属性和向下转型的对象的属性，进行比较，看两者的引用属性是否相同
        // 由此判断两个对象是否是同一个对象
        Doctor doctor2 = new Doctor("刘备", 19, "IT", '男', 50000);
        System.out.println(doctor.equals(doctor2));

    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    //重写equals方法,判断两个对象是否相同
    public boolean equals(Object obj){
        //判断传进来的obj对象和当前的对象Doctor是不是同一个对象（先判断是不是同一个对象））
        if (this == obj){
            return true;
        }
        //过关斩将 校验方式 判断obj是不是Doctor类型或Doctor类型的子类（再判断是不是同一个类型）
        if (! (obj instanceof Doctor)){//不是的话
            return false;
        }

        //向下转型，obj的运行类型是Doctor或者其他子类型（如果是同一个类型，则这里继续判断属性是否相同）
         Doctor doctor = (Doctor) obj;
        return this.age == doctor.age && this.gender == doctor.gender && this.job.equals(doctor.job)
                && this.name.equals(doctor.name) && this.sal == doctor.sal;

    }
}
