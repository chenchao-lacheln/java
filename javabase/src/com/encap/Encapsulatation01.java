package com.encap;

public class Encapsulatation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("lacheln你好吗");
        person.setAge(300);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        //自己使用构造器，指定属性
        Person lacheln = new Person("lacheln", 2000, 30000);
        System.out.println("=====输出lacheln的信息=====");
        System.out.println(lacheln.info());
        /**
         * set方法通过构造器，破解了
         * =====输出lacheln的信息=====
         * 信息为name = lacheln	age = 2000	salary = 30000.0
         *
         * 将set方法设置在构造器中后，即可完成校验
         * 名字的长度不对，需要（2-6）个字符,给一个默认名字
         * 您设置的年龄不对，需要在（1-120），给默认年龄18岁
         * =====输出lacheln的信息=====
         * 信息为name = 无名大侠	age = 18	salary = 30000.0
         */
    }
}

class Person{
    public String name;//名字公有话
    private int age;
    private double salary;

    //构建一个无参构造器 command + n
    public Person() {
    }
    //构建一个带三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //我们可以将set方法写在构造器中，这样仍然可以进行验证
        setName(name);//等价于this.setName(name)  setName就是指的本类的方法
        setAge(age);
        setSalary(salary);
    }

    //自己写setXxx 和getXxx太慢，使用快捷键
    //然后根据要求来完善我们的代码
    public String getName() {
        return name;
    }
    public void setName(String name) {
        //判断，加入对数据的校验,相当于增加了业务逻辑
        if (name.length() >=2 && name.length() <= 6) {
            this.name = name;
        }else {
            System.out.println("名字的长度不对，需要（2-6）个字符,给一个默认名字");
            this.name = "无名大侠";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if (age >=1 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("您设置的年龄不对，需要在（1-120），给默认年龄18岁");
            this.age = 18;//给一个默认年龄
        }
    }

    public double getSalary() {
        //可以在这里增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info(){
        return "信息为name = " + name + "\tage = " + age + "\tsalary = " + salary;
    }
}