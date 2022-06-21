package com.lacheln.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ListExercise
 *
 * @author chenchao
 * @date 2022/6/21 10:37 AM
 * @since 1.0.0
 */
public class ListExercise {
    public static void main(String[] args) {

        //●添加10个以上的元素(比如String "hello" ),在2号位插入一个元素"刘备"，
        // 获得第5个元素，删除第6个元素，修改第7个元素，在使用迭代器遍历集合
        //，要求:使用List的实现类ArrayList完成。
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list = " + list);
        //在2号位插入一个元素"刘备"
        list.add(1,"刘备");
        System.out.println("list = " + list);
        //获得第5个元素
        System.out.println(list.get(4));
        //删除第6个元素
        list.remove(5);
        System.out.println("list = " + list);
        //修改第7个元素
        list.set(6, "项羽");
        System.out.println("list = " + list);

        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object hello = iterator.next();
            System.out.println("hello = " + hello);
        }
    }
}

