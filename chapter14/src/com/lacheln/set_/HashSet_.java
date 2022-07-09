package com.lacheln.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet_
 *
 * @author chenchao
 * @date 2022/7/1 9:20 PM
 * @since 1.0.0
 */
public class HashSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1.构造器走的源码 HashSet实际上市HashMap
        /*
                public HashSet() {
                    map = new HashMap<>();
                }
         */
        //2.hashSet 可以存放null，但只能存放一个null，即元素不能重复
        Set hashSet = new HashSet();
        hashSet.add("null");
        hashSet.add("null");
        hashSet.add("null");
        System.out.println("hashSet" + hashSet);

    }
}
