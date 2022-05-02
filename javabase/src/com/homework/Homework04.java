package com.homework;

public class Homework04 {
    public static void main(String[] args) {
        DivisionManager manager = new DivisionManager("陈钗", 1000, 30, 1.2);
        //设置奖金
        manager.setBonus(1000);
        //打印经理工资情况
        manager.printSalary();

        new OrdinaryStaff("关羽",50,30,1.0).printSalary();
    }
}

//父类
class Staff {
    //员工属性：姓名，单日工资，工作天数
    private String name;
    private double dailyWage;
    private int day;
    private double grade;

    public Staff(String name, double dailyWage, int day, double grade) {
        this.name = name;
        this.dailyWage = dailyWage;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //打印工资方法
    public void printSalary(){
        System.out.println(name + " 工资=" + dailyWage*day*grade);
    }

}
//子类
//部门经理
class DivisionManager extends Staff{
    private double bonus;

    //创建DivisionManager对象的时候，奖金是多少并不是很确定，所以在构造器中不给bonus
    //可以通过setBonus赋值
    public DivisionManager(String name, double dailyWage, int day, double grade) {
        super(name, dailyWage, day, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("部门经理 " + getName() + " 工资 = " + (bonus + getDailyWage()*getDay()*getGrade()));
    }
}
//普通员工
class OrdinaryStaff extends Staff{
    public OrdinaryStaff(String name, double dailyWage, int day, double grade) {
        super(name, dailyWage, day, grade);
    }

    @Override
    public void printSalary() {
        System.out.print("普通员工 ");
        super.printSalary();
    }
}