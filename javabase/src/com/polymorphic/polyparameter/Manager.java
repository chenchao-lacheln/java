package com.polymorphic.polyparameter;

public class Manager extends Employee{
    //特有属性 奖金
    private double bonus;
    //初始化构造器
    public Manager(String name,double salary,double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理" + getName() + "is managing");
    }

    //重写获取年薪的方法

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
