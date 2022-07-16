package com.lacheln.generic;

import java.util.ArrayList;

/**
 * Generic01
 *
 * @author lacheln
 * @date 2022/7/16 23:11
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        //使用传统方法解决
        ArrayList list = new ArrayList();
        list.add(new Dog("来福",10));
        list.add(new Dog("旺财",1));
        list.add(new Dog("煤老板",5));

        //不能对加入到集合ArrayList中的数据类型进行约束(不安全)
        //假如程序员，不小心添加了一只猫
        list.add(new Cat("喵喵",3));
        
        //遍历
        for (Object o : list) {
            //向下转型 Object -->> Dog
            // 遍历的时候，需要进行类型转换，如果集合中的数据量较大，对效率有影响
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + " - " + dog.getAge());
            
        }

    }
}
/**
 * 1)请编写程序，在ArrayList 中，添加3个Dog对象
 * 2) Dog对象含有name和age,并输出name和age (要求使用getXxx())
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
