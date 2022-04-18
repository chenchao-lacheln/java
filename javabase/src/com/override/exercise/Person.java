package com.override.exercise;

public class Person {
    //私有化name和age属性
    private String name;
    private int age;
    //有构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //方法say（返回自我介绍的字符串）
    public String say(){
        return "name=" + name + " age=" + age;
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
