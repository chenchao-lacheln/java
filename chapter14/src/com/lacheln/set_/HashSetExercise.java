package com.lacheln.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * HashSetExercise
 *
 * @author lacheln
 * @date 2022/7/9 23:03
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        /**
         * 定义一个Employee类,该类包含: private成员属性name,age 要求:
         * 1.创建3个Employee对象放入HashSet中
         * 2.当name和age的值相同时，认为是相同员工，不能添加到HashSet集合中
         */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("lacheln",18));
        hashSet.add(new Employee("lacheln",28));
        hashSet.add(new Employee("lacheln",18));

        //没有重写hashCode和equals的情况
        //加入了几个？ 3个  hash() + equals() ，3个对象hash值不一样 -->> 没有达到要求
        System.out.println("hashSet = " + hashSet);

        //重写hashCode和equals之后，即：当name和age的值相同时，认为是相同员工，不能添加到HashSet集合中

    }
}

//创建Employee类
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写hashCode和equals： windows:alt + insert 快捷键
    //                        mac:command + n
    // 如果 name 和 age 值相同，则返回相同的hash值


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

