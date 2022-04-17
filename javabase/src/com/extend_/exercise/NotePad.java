package com.extend_.exercise;

public class NotePad extends Computer{
    //编写 NotePad 子类，继承 Computer 类，添加特有属性【color】
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void printNotePadInfo(){
        System.out.println("NotePad信息=");
        System.out.println(getComputerDetails() + " color" + color);
    }
}
