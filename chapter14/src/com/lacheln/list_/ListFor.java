package com.lacheln.list_;

import java.util.*;

/**
 * ListFor
 *
 * @author chenchao
 * @date 2022/6/21 12:26 PM
 * @since 1.0.0
 */
public class ListFor {
    public static void main(String[] args) {

        //List接口的实现子类 Vector LinkedList
//        List list = new ArrayList();
        List list = new LinkedList();
//        List list = new Vector();
        list.add("jack");
        list.add("marry");
        list.add("lacheln");
        list.add("tom");
        //方式一：迭代器遍历，iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
        //方式二：增强for循环
        for(Object o : list){
            System.out.println("o = " + o);
        }

        //方式三：普通for循环
        for (int i = 0 ; i < list.size();i++){
            System.out.println("对象 = " + list.get(i));
        }
    }
}
