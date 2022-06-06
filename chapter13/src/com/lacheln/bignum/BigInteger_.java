package com.lacheln.bignum;

import java.math.BigInteger;

/**
 * BigInteger_
 *
 * @author chenchao
 * @date 2022/6/6 12:22 PM
 * @since 1.0.0
 */
public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("22222222222222222222222222");
        BigInteger bigInteger1 = new BigInteger("1111111111111111");
        //BigInteger 进行加减乘除时，不能直接进行 + - * /
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);//加
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);//减
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);//乘
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);//除
    }
}
