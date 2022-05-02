package com.homework;

public class Homework01 {
    public static void main(String[] args) {
        //初始化Person对象数组，有3个Person对象
        Person[] persons = new Person[3];
        persons[0] = new Person("jack",30,"IT");
        persons[1] = new Person("lacheln",19,"猎头");
        persons[2] = new Person("富婆",20,"会计");

        //输出数组
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//默认对象的toString方法
        }

        //使用冒泡排序
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {//外层循环
            for (int j = 0; j < persons.length - 1 - i; j++) {//内层循环
                //按照年龄从大到小排序，如果前面人的age 小于 后面人的age 就交换
                if (persons[j].getAge() < persons[j + 1].getAge()){
                //按照姓名的长度 排序
//                if (persons[j].getName().length() < persons[j + 1].getName().length()){
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的效果");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}