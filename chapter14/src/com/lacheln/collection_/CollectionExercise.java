package com.lacheln.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CollectionExercise
 *
 * @author chenchao
 * @date 2022/6/20 10:45 AM
 * @since 1.0.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小黑",19));
        list.add(new Dog("大黑",18));
        list.add(new Dog("旺柴",11));
        
         //使用增强for循环
        for (Object Dog : list) {
            System.out.println("Dog = " + Dog);
        }

        //使用迭代器
        System.out.println("====使用迭代器遍历====");
        Iterator iterator = list.iterator();
        //快捷键itit
        while (iterator.hasNext()) {
            Object dog =  iterator.next();
            System.out.println("dog" + dog);
        }
    }
}

/**创建3 个Dog {name, age} 对象， 放入到ArrayList中，赋给List引用
 * 用迭代器和增强for循环两种方式来遍历
 重写Dog的toString 方法，输出name 和age
 */
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
