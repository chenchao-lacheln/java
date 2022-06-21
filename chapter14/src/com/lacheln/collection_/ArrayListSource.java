package com.lacheln.collection_;

import java.util.ArrayList;

/**
 * ArrayListSource
 *ArrayListSource底层操作机制源码分析（重难点！！）
 * @author chenchao
 * @date 2022/6/21 10:41 PM
 * @since 1.0.0
 */
public class ArrayListSource {
    public static void main(String[] args) {
        /*
        1) ArrayList中维护了一个Object类型的数组elementData; transient Object[] elementData; //transient表示瞬间 短暂的 表示elementData这个属性会被忽略，不会被序列化
        2) 当创建ArrayList对象时 ,如果使用的是无参构造器，则初始elementData容量为0, 第1次添加,则扩容elementData容量为10,如需要再次扩容，则扩容elementData容量为1.5倍
        3) 如果使用的是指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容elementData容量为1.5倍.
         */
        ArrayList arrayList = new ArrayList();
    }
}
