package com.lacheln.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * List_
 *
 * @author chenchao
 * @date 2022/6/20 1:11 PM
 * @since 1.0.0
 */
public class List_ {
    public static void main(String[] args) {
        //1.List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复[案例]
        List list = new ArrayList();
        list.add("Tom");
        list.add("Marry");
        list.add("Lacheln");
        list.add("Jack");
        list.add("Lacheln");
        System.out.println("List" + list);
        //2.List集合中，每个元素都有其对应的顺序索引，即支持索引
        System.out.println(list.get(3));
        //3.常用的有 ArrayList LinkedList Vector

    }
}
