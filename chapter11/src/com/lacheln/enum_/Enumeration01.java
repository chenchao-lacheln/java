package com.lacheln.enum_;

/**
 * Enumeration01
 *
 * @author lacheln
 * @date 2022/5/17 02:06
 * @since 1.0.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        //使用
        Session spring = new Session("春天", "温暖");
        Session summer = new Session("夏天", "炎热");
        Session automn = new Session("秋天", "凉爽");
        Session winter = new Session("冬天", "寒冷");
        /*
        对于季节而言，他的对象（具体值），是固定的四个，不会有更多
        因此，这个设计思路，不能体现季节是四个固定的对象
        设计不好====>>枚举类：即把具体的对象一个一个列举出来
         */
        Session other = new Session("天天", "XXX");
        //spring.setName("hhh ");
        //spring.setDesc("莎莎和");
    }
}
class Session {//类
    private String name;
    private String desc;

    public Session(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
