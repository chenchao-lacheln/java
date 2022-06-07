package com.lacheln.math_;

/**
 * MathMethod
 *
 * @author lacheln
 * @date 2022/6/4 22:15
 * @since 1.0.0
 */
public class MathMethod {
    public static void main(String[] args) {
        /*
        1.random 求随机数
        2.random 返回的是0 <= x < 1 之间的一个随机小数
        3.思考：请写出 获取 a，b之间的一个随机整数，a，b均为整数，比如 a=2,b=7
        4.即 返回一个数 x  2 <= x <= 7
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(2 + (int) (Math.random() * (7 - 2 + 1)));
        } 
    }
}
