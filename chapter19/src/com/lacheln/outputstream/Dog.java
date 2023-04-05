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
    //序列化对象时，要求里面属性的类型也需要实现序列化接口
    private Master master = new Master();

    //序列化对象时，默认将里面所有属性都进行序列化，但除了static和transient修饰的成员
    private static String nation;
    private transient String color;
    //如果有增加序列化版本号的话，新增一个属性，不会被认为是一个全新的Dog类，会认为是原先Dog的升级版本
    private String hobby;
    //serialVersionVID 序列化的版本号，可以提高兼容性
    private static final long serialVersionVID = 1L;

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.color = color;
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
                ", color='" + color + '\'' +
                ", nation='" + nation + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
}

