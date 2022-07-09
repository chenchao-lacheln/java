package com.lacheln.bignum;

import java.math.BigDecimal;

/**
 * BigDecimal_
 *
 * @author chenchao
 * @date 2022/6/6 7:31 PM
 * @since 1.0.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1999.11121414134142141414214141");
        BigDecimal bigDecimal1 = new BigDecimal("3");
        System.out.println("加 = " + bigDecimal.add(bigDecimal1));//加
        System.out.println("减 = " + bigDecimal.subtract(bigDecimal1));//减
        System.out.println("乘 = " + bigDecimal.multiply(bigDecimal1));//乘
//        System.out.println(bigDecimal.divide(bigDecimal1));//除 可能抛出异常ArithMeticException（可能除不尽）
        //如果除不尽，在调用divide方法时，指定精度即可，BigDecimal.ROUND_DOWN 会保留分子的精度
        System.out.println("除 = " + bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_DOWN));//除
    }
}
