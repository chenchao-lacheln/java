package com.lacheln.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * Homework03
 *
 * @author chaochen
 * @date 2023/5/30
 * @since 1.0.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        /**
         * （1）要编写一个dog.properties
         * name=tom
         * age=5
         * color=red
         * (2） 编写Dog 类(name,age,color）创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化，并输出
         * (3) 将创建的Dog 对象，序列化到 文件dog.dat 文件
         */
        String filePath = "chapter19/src/com/lacheln/homework/dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
//        properties.list(System.out); //输出到控制台
//        String name = properties.getProperty("name");
//        System.out.println("name = " + name); //输出到控制台
        String name = properties.get("name") + ""; //Object -> String
        int age = Integer.parseInt(properties.get("age") + ""); // Object -> int
        String color = properties.get("color") + ""; //Object -> String

        Dog dog = new Dog(name, age, color);
        System.out.println("====dog对像信息====");
        System.out.println(dog);

        //将创建的Dog 对象，序列化到 文件dog.dat 文件
        String serFilePath = "/Users/chenchao/Downloads/dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);

        //关闭流
        oos.close();
        System.out.println("dog对像，序列化完成...");

    }
    ////编写一个方法，反序列化dog
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String serFilePath = "/Users/chenchao/Downloads/dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)ois.readObject();

        System.out.println("===反序列化后 dog===");
        System.out.println(dog);

        ois.close();
    }
}

//注意dog对像需要执行序列化 需要实现 Serializable 接口
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
