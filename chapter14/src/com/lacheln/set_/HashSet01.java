package com.lacheln.set_;

import java.util.HashSet;

/**
 * HashSet01
 *
 * @author chenchao
 * @date 2022/7/6 10:19 AM
 * @since 1.0.0
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        // 1.在执行add方法后 会返回一个Boolean 值
        // 2.添加成功返回TRUE 添加失败 返回FALSE
        // 3.可以通过 remove 删除指定对象
        System.out.println(set.add("Jhon"));//T
        System.out.println(set.add("Lucy"));//T
        System.out.println(set.add("Jhon"));//F
        System.out.println(set.add("Jack"));//T
        System.out.println(set.add("lacheln"));//T

        set.remove("Jhon");
        System.out.println("set = " + set);

        //4.HashSet不能添加相同的元素或者数据
        set = new HashSet();
        System.out.println("set = " + set);
        set.add("Lucy");//添加成功
        set.add("Lucy");//加入不了
        set.add(new Dog("Tom"));//ok
        set.add(new Dog("Tom"));//ok
        System.out.println("set = " + set);

        //5.在加深一下，非常经典的面试题
        //需要看源码分析，add发生了什么？==>> 底层机制
        set.add(new String("lacheln"));//ok
        set.add(new String("lacheln"));//加入不了
        System.out.println("set = " + set);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
