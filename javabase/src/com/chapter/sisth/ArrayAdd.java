package com.chapter.sisth;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        /**
         * 数组扩容比较慢，链表扩容更快！
         */

        Scanner myScanner = new Scanner(System.in);
        int[] array = {1, 2, 3};
        do {
            int[] newArray = new int[array.length + 1];
//            遍历数组，将arry数组中的数据拷贝到newArry数组中
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            System.out.println("请输入你要添加的数字：");
            int addNum = myScanner.nextInt();
//            将addNum赋值给newArry的最后一个
            newArray[newArray.length - 1] = addNum;
//            让arry 指向 newArry
            array = newArray;
//            输入newArry查看效果
            for (int j = 0; j < newArray.length; j++) {
                System.out.println("newArry=" + newArray[j]);
            }
//            问用户是否继续添加
            System.out.println("请确认是否继续添加（Y/N）?");
            char isTrue = myScanner.next().charAt(0);
            if (isTrue == 'N'){
                break;
            }
        }while (true);
        System.out.println("添加结束。。。");
    }
}
