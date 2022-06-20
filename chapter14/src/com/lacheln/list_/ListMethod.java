package com.lacheln.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * ListMethod
 *
 * @author chenchao
 * @date 2022/6/20 1:19 PM
 * @since 1.0.0
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
//        void add(int index, Object ele):在index位置插入ele元素
        //在index=1的位置上 插入一个对象
        list.add(1,"拉扯林");
        System.out.println("list = " + list);
//        boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = new ArrayList();
        list1.add("lacheln");
        list1.add("jack");
        list1.add("lacheln");
         list.addAll(1,list1);
        System.out.println("list = " + list);
//        Object get(int index):获取指定index位置的元素
        System.out.println(list.get(1));
//        int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("lacheln"));
//        int lastlndexOf(Object obj);:返回obj在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf("lacheln"));
//        Object remove(int index):移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(0));
        System.out.println("list = " + list);
//        Object set(int index, Object ele):设置指定index位置的元素为ele相当于是替换。
        System.out.println(list.set(1, "超哥"));
        System.out.println("list = " + list);
//        List subList(int fromIndex, int tolndex):返回从fromIndex到tolndex位置的子集合
//        注意 返回的集合 是 [)  前闭后开的区间
        List returnList = list.subList(0, 3);
        System.out.println("returnList" + returnList);
    }
}
