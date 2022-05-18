package com.lacheln.enum_;

/**
 * Enumeration02
 *
 * @author lacheln
 * @date 2022/5/19 01:20
 * @since 1.0.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Session1.AUTUMN);
        System.out.println(Session1.SPRING);
        System.out.println(Session1.SUMMER);
        System.out.println(Session1.WINTER);
    }
}

//演示自定义枚举实现

class Session1 {//类
    private String name;
    private String desc;

    //定义四个对象
    public final static Session1 SPRING = new Session1("春天","温暖");
    public final static Session1 SUMMER = new Session1("夏天", "炎热");
    public final static Session1 AUTUMN = new Session1("秋天", "凉爽");
    public final static Session1 WINTER = new Session1("冬天", "寒冷");

    //1.构造器私有化，防止直接被new
    //2.去掉setXxx方法，防止属性被修改
    //3.在Session1内部直接创建 固定的对象
    //4.可以再加个Final修饰

    private Session1(String name, String desc) {
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
        return "Session1{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


