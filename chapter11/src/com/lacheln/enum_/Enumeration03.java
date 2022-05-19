package com.lacheln.enum_;

/**
 * Enumeration03
 *
 * @author lacheln
 * @date 2022/5/19 01:34
 * @since 1.0.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Session2.AUTUMN);
        System.out.println(Session2.SPRING);
        System.out.println(Session2.AUTUMN);
        System.out.println(Session2.WINTER);
    }
}

//演示 使用enum关键字 实现枚举类
enum Session2 {//类


    //定义四个对象
//    public final static Session2 SPRING = new Session2("春天","温暖");
//    public final static Session2 SUMMER = new Session2("夏天", "炎热");
//    public final static Session2 AUTUMN = new Session2("秋天", "凉爽");
//    public final static Session2 WINTER = new Session2("冬天", "寒冷");
    //如果使用了enum 来实现枚举类
    /*
    1.使用关键字 enum替代class
    2.public final static Session2 SPRING = new Session2("春天","温暖"); 直接使用 SPRING("春天","温暖");
          SPRING("春天","温暖");  即 常量名（实参列表）
    3.如果有多个常量（对象），使用 ， 间隔即可
    4.如果使用enum实现枚举，要求将定义常量对象，写在前面
    5.如果我们使用的是无参构造器，创建常量对象。可以省略（）；
     */
    SPRING("春天","温暖"),SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),WINTER("冬天", "寒冷"),
    WHAT();//WHAT()是调用的无参构造器 WHAT() 可以简化为WHAT；
    private String name;
    private String desc;

    private Session2(){//无参构造器

    }

    private Session2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Session2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
