package com.lacheln.exception_;

/**
 * NumFormateException_
 *
 * @author lacheln
 * @date 2022/5/29 13:13
 * @since 1.0.0
 */
public class NumFormateException_ {
    public static void main(String[] args) {
        String name1 = "1234";
        String name2 = "lacheln";
        //将String 转换成 int
        int num1 = Integer.parseInt(name1);
        System.out.println(num1);//1234
        int num2 = Integer.parseInt(name2);
        System.out.println(name2);//NumFormateException
    }
}
