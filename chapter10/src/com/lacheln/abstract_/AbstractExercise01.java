package com.lacheln.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manage lacheln = new Manage("lacheln", 001, 50000);
        lacheln.setBonus(100000);
        lacheln.worik();

    }
}
abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //抽象方法work
    public abstract void worik();
}

class Manage extends Employee{
    private double bonus;

    //构造器
    public Manage(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //重写work方法
    @Override
    public void worik() {
        System.out.println("经理 " + getName() + " 工作中...");
    }
}

class CommonEmployee extends Employee{
    //构造器

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    //重写work方法
    @Override
    public void worik() {
        System.out.println("普通员工 " + getName() + " 工作中...");
    }
}