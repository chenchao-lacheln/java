package com.polymorphic;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态机制 可以统一管理主人喂食物的问题
    //animal的编译类型是Animal，可以指向Animal子类的对象
    //food的编译类型是Food，可以指向Food子类的对象
    public void feed(Animal animal, Food food){
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
    }

//    //主任给小狗 喂食 骨头
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
//    }
//
//    //主任给小猫 喂食 黄花鱼
//    public void feed(Cat cat, Fish fish){
//        System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃 " + fish.getName());
//    }
}
