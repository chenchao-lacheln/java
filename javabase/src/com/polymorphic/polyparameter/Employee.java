package com.polymorphic.polyparameter;

public class Employee {
    //定义属性 姓名和月工资
    private String name;
    private double salary;

    //初始化构造器
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    //获取年工资的方法
    public double getAnnual(){
        return 12 * salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

}
