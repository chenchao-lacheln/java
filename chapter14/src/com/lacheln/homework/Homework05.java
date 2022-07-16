package com.lacheln.homework;

import java.util.TreeSet;

/**
 * Homework05
 *
 * @author lacheln
 * @date 2022/7/16 22:16
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class Homework05 {
    public static void main(String[] args) {
        /**
         * 下面代码运行会不会抛出异常，并从源码层面说明原因. [考察读源码+接口编程+动态绑定]
         *  TreeSet treeSet = new TreeSet();
         *  treeSet.add(new Person());
         */
        TreeSet treeSet = new TreeSet();
        //源码分析
        //add 方法，因为TreeSet() 构造器,没有传入Comparator接口的匿名内部类，
        // 所以在底层，  Comparable<? super K> k = (Comparable<? super K>) key;
        //即 把 Person 对象转成 Comparable 类型
        // 而 Person 没有实现 Comparable 接口
        //所有 会报错 ClassCastException
        //解决办法就是实现Comparable接口即可
        treeSet.add(new Person()); //ClassCastException
        treeSet.add(new Person()); //ClassCastException
        treeSet.add(new Person()); //ClassCastException
        treeSet.add(new Person()); //ClassCastException
        //上面添加了4个Person，但是只会有一个Person，因为return 0; 返回0就认为是相同的元素
        //因此，可以自己定义规则:按照名字或者按照hash值
        System.out.println(treeSet);
    }
}
class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
};
