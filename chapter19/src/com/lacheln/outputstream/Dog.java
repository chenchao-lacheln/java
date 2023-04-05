package com.lacheln.outputstream;

/**
 * Dog
 *
 * @author chaochen
 * @date 2023/4/5
 * @since 1.0.0
 * <p>
 * 新增共有Dog类，解决序列化和反序列化包不一致的问题
 */

import java.io.Serializable;

//如果需要序列化某个类的对象，需要实现 Serializable 接口
public class Dog implements Serializable {
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

