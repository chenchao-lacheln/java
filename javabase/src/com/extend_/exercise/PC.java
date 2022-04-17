package com.extend_.exercise;

public class PC extends Computer{
//    编写 PC 子类，继承 Computer 类，添加特有属性【品牌 brand】
//    注意在继承的时候，如果父类没有无参构造器，这里会报错。
    private String brand;

    //这里IDEA 根据继承的规则 自动把构造器的调用写好
    //这里也体现出：继承设计的基本思想，父类的构造器完成父类属性的初始化
    //子类的构造器完成子类属性的初始化
    public PC(String cpu, int memory, int disk,String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printPCInfo(){
        System.out.println("PC信息=");
        //调动父类的getComputerDetails方法，得到相关的属性信息
        System.out.println(getComputerDetails() + " brand" + brand);
    }
}
