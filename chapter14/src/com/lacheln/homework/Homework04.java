package com.lacheln.homework;

import java.util.TreeSet;

/**
 * Homework04
 * 分析HashSet和TreeSet分别是如何实现去重的
 * @author lacheln
 * @date 2022/7/16 22:01
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class Homework04 {
    public static void main(String[] args) {
        /**  分析HashSet和TreeSet分别是如何实现去重的
         *
         * (1)HashSet的去重机制：HashCode() + equals(),底层先通过存入对象，进行运算得到一个hash值，
         * 通过hash值得到对应的索引，如果发现table索引所在的位置，没有数据，就直接存放，如果有数据，就进
         * 行equals比较（如果是一个链表，就遍历比较），比较厚，不相同，就加入，否则就不加入
         * (2)TreeSet的去重机制：如果你传入了一个Comparator匿名对象，就使用实现的compare去重，如果方法
         * 返回0，就认为是相同的元素/数据,就不添加。如果你没有传入一个Comparator匿名对象，则以你添加的
         * 对象实现的(这里是通过向上转型，本质是使用的String中的compareTo方法)Comparable接口
         * 的compareTo去重
         *     注意：String本身是实现了Comparable接口，
         */
        TreeSet treeSet = new TreeSet();
        //演示不指定
        treeSet.add("lacheln");
        treeSet.add("tom");
        treeSet.add("marry");
        treeSet.add("tom");//加入不了,根本原因就是：字符串的compareTo方法时比较的内容，所以加入不了
        System.out.println(treeSet);
    }
}
