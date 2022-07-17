package com.lacheln.junit_;

import org.junit.jupiter.api.Test;

/**
 * JUnit_
 *
 * @author lacheln
 * @date 2022/7/17 23:13
 * @since 1.0.0
 */
public class JUnit_ {
    public static void main(String[] args) {
        //传统方法
        //new JUnit_().m1();
        //new JUnit_().m2();
    }

    @Test
    public void m1(){
        System.out.println("m1方法被调用");
    }

    @Test
    public void m2(){
        System.out.println("m2方法被调用");
    }
}
