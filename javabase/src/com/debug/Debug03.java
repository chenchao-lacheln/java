package com.debug;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] array = {1, -1, 10, -20, 100};
        //查看Arrays.sort方法底层实现
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
