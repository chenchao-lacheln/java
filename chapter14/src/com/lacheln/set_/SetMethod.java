package com.lacheln.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * SetMethod
 *
 * @author chenchao
 * @date 2022/6/24 4:42 PM
 * @since 1.0.0
 */
public class SetMethod {
    public static void main(String[] args) {
        //1.以Set接口实现类 HashSet为例
        //2.set接口的实现类的对象（set接口对象），不能存放重复的元素，可以添加一个null
        //3.set接口存放数据是无序的（即添加的顺序和取出的顺序不一致）
        //4.取出的顺序虽然不是添加的顺序，但是他是固定的
        Set set = new HashSet();
        set.add("marry");
        set.add("marry");
        set.add("lacheln");
        set.add("jack");
        set.add("null");
        set.add("null");

//        for (int i = 0; i < 10; i++) { //
//            System.out.println("set = " + set);
//        }
        //遍历
        //方式一：迭代器
        System.out.println("====使用迭代器====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }

        System.out.println("====增强for循环====");
        for (Object o : set) {
            System.out.println(" o = " + o);
        }

        //set 接口对象，不能通过索引来获取


    }
}
