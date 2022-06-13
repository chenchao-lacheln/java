package com.lacheln.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * CollectionMethod
 *ArrayList常用方法
 * @author lacheln
 * @date 2022/6/14 00:53
 * @since 1.0.0
 */
public class CollectionMethod {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})
        List list = new ArrayList();
//        1) add:添加单个元素
        list.add("lacheln");
        list.add(10);//自动装箱 等价于list.add(new Integer(10))
        list.add(true);
        System.out.println("list = " + list);//list[lacheln, 10, true]是对象，不是基本数据类型
//        2) remove:删除指定元素
//        list.remove(0);//删除第一个元素
        list.remove("lacheln");
        System.out.println("list = " + list);
//        3) contains:查找元素是否存在
        System.out.println(list.contains(10));//T
//        4) size:获取元素个数
        System.out.println(list.size());//2
//        5) isEmpty:判断是否为空
        System.out.println(list.isEmpty());//F
//        6) clear:清空
        //list.clear();
        //System.out.println("list = " + list);
//        7) addAll:添加多个元素
        ArrayList list1 = new ArrayList();
        list1.add("h哈哈哈");
        list1.add("滴滴");
        list.addAll(list1);
        System.out.println("list = " + list);
//        8) containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(list1));//T
//        9) removeAll:删除多个元素
        list.add("刘内");
        list.removeAll(list1);
        System.out.println("list = " + list);//list = [10, true, 刘内]
//        10)说明:以ArrayList实现类来演示.
    }
}
