package com.lacheln.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climbing();
        wukong.swimming();
        wukong.flying();

    }
}
//猴子
/*
总结
1.当子类继承了父类，就自动拥有父类的功能
2.如果子类需要扩展功能，可以通过实现接口的方式进行扩展
3.实现接口，是对java单继承机制的一种补充
 */
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + "会爬树...");
    }
}

//小猴子
class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }
    //
    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习，可以像鱼儿一样游泳了");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习，可以像鸟儿一样飞翔了");
    }
}

//接口
interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}