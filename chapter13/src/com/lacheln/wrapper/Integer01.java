package com.lacheln.wrapper;

/**
 * Integer01
 *演示int <--> integer 装箱和拆箱
 * @author lacheln
 * @date 2022/5/29 23:17
 * @since 1.0.0
 */
public class Integer01 {
    public static void main(String[] args) {
        //jdk5前是手动装箱和拆箱
        //手动装箱 int -->> Integer
        int n1 = 10;
        //第一种方式
        Integer integer = new Integer(n1);
        //第二种方式
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        //Integer -->> int
        int i = integer.intValue();

        /**
         * 面试经常问
         */
        //jdk5之后，就可以自动装箱和自动拆箱
        int n2 = 100;
        //自动装箱  int -->> Integer
        Integer integer2 = n2; //底层使用的是 Integer.valueOf(n2);
        //自动拆箱 Integer -->> int
        int n3 = integer2;//底层使用的是 intValue()方法
    }
}
