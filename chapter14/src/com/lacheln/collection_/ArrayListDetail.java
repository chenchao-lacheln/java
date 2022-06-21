package com.lacheln.collection_;

import java.util.ArrayList;

/**
 * ArrayListDetail
 *
 * @author chenchao
 * @date 2022/6/21 10:33 PM
 * @since 1.0.0
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
//        1) permits all elements, including null , ArrayList可以加入null,并且多个
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("lacheln");
        System.out.println(arrayList);
//        2) ArrayList是由数组来实现数据存储的
//        3) ArrayList基本等同于Vector ,除了ArrayList是线程不安全(执行效率高)看源码(没有synchronized关键字，此关键字是做线程互斥).
//        在多线程情况下，不建议使用ArrayList，建议使用 Vector
        /*
        public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
         */
    }
}
