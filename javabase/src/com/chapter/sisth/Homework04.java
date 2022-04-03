package com.chapter.sisth;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        /**
         * 已知一个升序数组，要求插入一个元素，该数组顺序依然是升序，比如：[10,12,45,90]，添加23后，数组为[10,12,23,45,90]
         * 分析
         * 1.定义一个数组[10,12,45,90]，定义一个临时数组，新数组
         * 2.
         */
        Scanner myScanner = new Scanner(System.in);

        int[] array = {10,12,45,90};
        int[] newArray = new int[array.length + 1];
        int temp = 0;

        //请输入你要添加的数字
        System.out.println("请输入你要添加的数字");
        int num = myScanner.nextInt();

        for (int i = 0;i < array.length;i++) {
            //将array数组赋给newArrsy
            newArray[i] = array[i];
            for (int j = 0; j < i + 1; j++) {
                if (num >= array[i] && num <= array[j]){
                    newArray[i + 1] = num;
                }
            }
        }

        //打印看效果
        for (int i = 0;i < newArray.length;i++){
            System.out.print(newArray[i] + "\t");
        }
    }
}
