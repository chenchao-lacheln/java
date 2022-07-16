package com.lacheln.generic.improve;

import java.util.ArrayList;

/**
 * Generic02
 * 泛型完成代码
 * @author lacheln
 * @date 2022/7/16 23:23
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        //使用传统方法解决 == >> 使用泛型
        //1.ArrayList<Dog>表示存放到list集合中的元素是 Dog类型
        //2.如果编译器发现添加的类型，不满足要求，就会报错
        //3.在遍历的时候，可以直接取出Dog类型，而不是Object类型
        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("来福",10));
        list.add(new Dog("旺财",1));
        list.add(new Dog("煤老板",5));

        //假如程序员，不小心添加了一只猫
//        list.add(new Cat("喵喵",3));

        System.out.println("====使用泛型====");
        for (Dog dog : list) {
             //原先list是需要放在Object里面，不能直接使用Dog对象，需要进行向下转型
            System.out.println(dog.getName() + " - " + dog.getAge());
        }

    }
}

/**
 * 1)请编写程序，在ArrayList 中，添加3个Dog对象
 * 2) Dog对象含有name和age,并输出name和age (要求使用getXxx())
 * 3) 使用泛型完成代码
 */
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


//猫类
class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
