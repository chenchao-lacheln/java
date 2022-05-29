package com.lacheln.exception_;

/**
 * ArrayIndexOutOfBoundsException_
 *
 * @author lacheln
 * @date 2022/5/29 13:04
 * @since 1.0.0
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]); 
        }
    }
}
