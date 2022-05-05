package com.lacheln.static_;

public class ChildGame {
    public static void main(String[] args) {

        //定义变量 统计有多少小孩加入游戏
        int count = 0;
        Child child = new Child("超超");
        child.join();
        count++;
        Child child1 = new Child("刘备");
        child1.join();
        count++;
        Child child2 = new Child("张飞");
        child2.join();
        count++;
        Child child3 = new Child("关羽");
        child3.join();
        count++;

        //========
        System.out.println("共有 " + count + " 小孩加入了游戏");
    }
}

class Child{//类
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + "加入了游戏...");
    }
}
