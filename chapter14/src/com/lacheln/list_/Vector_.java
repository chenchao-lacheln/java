package com.lacheln.list_;

import java.util.Vector;

/**
 * Vector_
 *
 * @author chenchao
 * @date 2022/6/22 12:58 PM
 * @since 1.0.0
 */
public class Vector_ {
    public static void main(String[] args) {
        //如果是无参，默认10，满后，按照2倍扩容；如果指定大小，则每次按照2倍扩容
        //无参构造器
//        Vector vector = new Vector();
        //指定大小
        Vector vector = new Vector(8);


        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector = " + vector);
    }
}
