package com.chapter08;

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        //使用系统提供的Arrays进行排序
        //传统方法是自己编写排序，比如冒泡排序
        int[] arr01 = {-1,20,60,34,5};
        Arrays.sort(arr01);
        //输出结果
        for (int i = 0; i < arr01.length; i++) {
            System.out.print(arr01[i] + "\t");
        }
    }
}
