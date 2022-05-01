package com.debug;

public class Debug02 {
    public static void main(String[] args) {
        //数组越界
        int[] array = {1, 10, -1};
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("退出for...");
    }
}
