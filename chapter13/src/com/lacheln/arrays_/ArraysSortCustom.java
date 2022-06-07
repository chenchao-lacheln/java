package com.lacheln.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ArraysSortCustom
 *
 * @author lacheln
 * @date 2022/6/4 22:53
 * @since 1.0.0
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};
        //bubble01(arr);
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {//o1,o2 就是 c.compare(arr[j],arr[j + 1])传入的arr[j],arr[j + 1]
                int i1 = (Integer) o1;//拆箱
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("===定制排序后的情况===");
        System.out.println(Arrays.toString(arr));
    }

    //使用冒泡完成排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大排序
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //结合冒泡+ 定制
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组的排序，由c.compare(arr[j],arr[j + 1]) 返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
