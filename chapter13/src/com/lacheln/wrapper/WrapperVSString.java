package com.lacheln.wrapper;

/**
 * WrapperVSString
 *
 * @author lacheln
 * @date 2022/5/29 23:39
 * @since 1.0.0
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类Integer -->> String
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";//只是得到了额一个String类型的，对原先的i的数据类型 是没什么影响的
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String-->> 包装类Integer
        String str4 = "123";
        //方式1
        Integer i1 = Integer.parseInt(str4);//使用到了自动装箱
        //方式2
        Integer i2 = new Integer(str4);//构造器

        System.out.println("ok~~");
    }
}
