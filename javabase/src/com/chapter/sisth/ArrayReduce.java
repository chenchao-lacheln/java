package com.chapter.sisth;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};

        do {
            int[] arrayReduce = new int[array.length - 1];
//        遍历array数组，赋值给arrayReduce
            for (int i = 0; i < array.length - 1; i++) {
                arrayReduce[i] = array[i];
            }
//        将arrayReduce 数组赋给array
            array = arrayReduce;
            System.out.println("请问是否继续缩减(y/n)：");
            char isTrue = myScanner.next().charAt(0);
            if (isTrue == 'n' || array.length == 0){
                System.out.println("当前剩余" + array.length + "个数字，已终止程序！");
                break;
            }
//        打印新数组查看效果
            for (int i = 0; i < arrayReduce.length; i++) {
                System.out.println("arrayReduce = " + arrayReduce[i]);
            }
        }while (true);
    }
}
