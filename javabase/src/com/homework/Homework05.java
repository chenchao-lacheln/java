package com.homework;

public class Homework05 {
    public static void main(String[] args) {
        //工人
        new Worker("刘备",30,30).yearSalary();
        //农民
        new Farmer("项羽",30,40).yearSalary();
        //教师
        Teacher1 teacher1 = new Teacher1("关羽", 30, 80);
        teacher1.setSalMonth(15);
        teacher1.setClassPay(200);
        teacher1.setClassDay(8);
        teacher1.yearSalary();
        //科学家工资
        Scientst zf = new Scientst("张飞", 30, 100);
        zf.setSalMonth(20);
        zf.setBonus(100000);
        zf.yearSalary();
        //服务生
        new Waiter("马超",30,70).yearSalary();
    }
}
//父类：员工
class Employee {
    private String name;
    private int workDay;
    private double daySal;
    //分析有一个带薪的月份12薪,15薪
    private int salMonth = 12;

    public Employee(String name, int workDay, double daySal) {
        this.name = name;
        this.workDay = workDay;
        this.daySal = daySal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    //打印年薪
    public void yearSalary(){
        System.out.println(name + " 工资 " + (workDay * daySal * salMonth));
    }
}
//子类：工人
class Worker extends Employee{
    public Worker(String name, int workDay, double daySal) {
        super(name, workDay, daySal);
    }

    @Override
    public void yearSalary() {
        System.out.print("工人 ");
        super.yearSalary();
    }
}
//子类：农民
class Farmer extends Employee{
    public Farmer(String name, int workDay, double daySal) {
        super(name, workDay, daySal);
    }
    @Override
    public void yearSalary() {
        System.out.print("农民 ");
        super.yearSalary();
    }
}
//子类：教师
class Teacher1 extends Employee{
    //老师有课酬
    private double classPay;
    private int classDay;
    public Teacher1(String name, int workDay, double daySal) {
        super(name, workDay, daySal);
    }

    public double getClassPay() {
        return classPay;
    }

    public void setClassPay(double classPay) {
        this.classPay = classPay;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    @Override
    public void yearSalary() {
        System.out.println("老师 " + getName() + " 工资 " + (classPay * classDay + getWorkDay() * getDaySal() * getSalMonth()));
    }
}
//子类：科学家
class Scientst extends Employee{
    //科学家 有年终奖
    private double bonus;

    public Scientst(String name, int workDay, double daySal) {
        super(name, workDay, daySal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void yearSalary() {
        System.out.println("科学家 " + getName() + " 工资 " + (bonus + getWorkDay() * getDaySal() * getSalMonth()));
    }
}
//子类：服务生
class Waiter extends Employee{
    public Waiter(String name, int workDay, double daySal) {
        super(name, workDay, daySal);
    }

    @Override
    public void yearSalary() {
        System.out.print("服务生 ");
        super.yearSalary();
    }
}

