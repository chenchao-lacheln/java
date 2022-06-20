package com.lacheln.collection_;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;

/**
 * CollectionFor
 *
 * @author chenchao
 * @date 2022/6/20 10:25 AM
 * @since 1.0.0
 */
public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList clo = new ArrayList();
        clo.add(new Book("三国","罗贯中",10.1));
        clo.add(new Book("小李飞刀","古龙",5.1));
        clo.add(new Book("红楼梦","曹雪芹",34.6));

        //使用增强for循环,在collection
        //增强for，底层仍然是迭代器
        //增强for可以理解成就是简化版本的迭代器遍历
        //快捷键 输入大写的I
        for (Object book : clo){
            System.out.println("book = " + book);
        }

//        //增强for循环也可以在数组上使用
//        int[] nums = {1,2,3,4,60};
//        for(int i : nums){
//            System.out.println("i = " + i);
//        }
    }
}
