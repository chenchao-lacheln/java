package com.lacheln.static_;

public class ChildGame {
    public static void main(String[] args) {

        //定义变量 统计有多少小孩加入游戏
        int count = 0;
        Child child = new Child("超超");
        child.join();
        //count++;
        child.count++;

        Child child1 = new Child("刘备");
        child1.join();
        //count++;
        child1.count++;

        Child child2 = new Child("张飞");
        child2.join();
        //count++;
        child2.count++;

        Child child3 = new Child("关羽");
        child3.join();
        //count++;
        child3.count++;


        //========
        //类变量，可以通过类名访问
        System.out.println("共有 " + Child.count + " 小孩加入了游戏");
        //下面的代码输出什么？
        System.out.println("child.count = " + child.count);//4
        System.out.println("child1.count = " + child1.count);//4
        System.out.println("child2.count = " + child2.count);//4
        System.out.println("child3.count = " + child3.count);//4
    }
}

class Child{//类
    private String name;
    //定义一个变量count，是一个类变量（静态变量）static 静态
    //该变量最大的特点就是会被Child类的所有对象的实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + "加入了游戏...");
    }
}
