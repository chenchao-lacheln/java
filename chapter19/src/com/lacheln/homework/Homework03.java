package com.lacheln.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        new Dog().dog();
    }
    /**
     * （1）要编写一个dog.properties
     * name=tom
     * age=5
     * color=red
     * (2） 编写Dog 类(name,age,color）创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化，并输出
     * (3) 将创建的Dog 对象，序列化到 文件dog.dat 文件
     */
}
class Dog{
    public void dog() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("chapter19/src/com/lacheln/homework/dog.properties"));
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        String color = properties.getProperty("color");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("color = " + color);
    }
}
