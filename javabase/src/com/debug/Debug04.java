package com.debug;

import java.util.Arrays;

//执行到下一个断点，同时支持动态下断点
public class Debug04 {
    public static void main(String[] args) {
        int[] array = {1, -1, 10, -20, 100};
        //查看Arrays.sort方法底层实现
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
        System.out.println("hello700");
    }
}
