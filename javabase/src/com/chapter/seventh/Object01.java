package com.chapter.seventh;

public class Object01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "超超";
        cat1.age = 34;
        cat1.color = "白色";
        cat1.weight = 100;

        Cat cat2 = new Cat();
        cat2.name = "哈哈";
        cat2.age = 90;
        cat2.color = "黑色";
        cat2.weight = 233;

        System.out.println("第一只猫的信息为 " + cat1.name + " " + cat1.age + " " + cat1.color + " " +cat1.weight);
        System.out.println("第二只猫的信息为 " + cat2.name + " " + cat2.age + " " + cat2.color + " " + cat2.weight);

        Person person = new Person();
        person.cal02(90);

        Person chenchao = new Person();
        chenchao.cal02(9876);
        int getAge = chenchao.getAge(1,2);
        System.out.println("getAge的返回值为 ：" + getAge);
    }
}




//定义一个猫类
class Person{
    String name;
    int age;
    String color;
    double weight;

    public void cal02(int n){
        int result = 0;
        for (int i = 0; i < n;i++){
            result += i;
        }
        System.out.println("cal02的结果为：" + result);
    }


    public int getAge(int num1,int num2){
        int result = num1 + num2;
        return result;
    }
}



class Cat{
    String name;
    int age;
    String color;
    double weight;


}
