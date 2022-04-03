package com.chapter.seventh;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        String[] array = {"aaa","bbbb","ccc","rrr","kkkk"};
        A02 p2 = new A02();
        p2.find(array);
    }
}
//编写类A02，定义方法find，实现查找某字符串数组中的元素，并返回索引，如果找不到，返回01；
class A02 {
    public void find(String[] array){
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入需要查找的字符串");
//        String p1 = myScanner.next();
        String p1 = "000";
        for (int i = 0;i < array.length;i++){
            if (p1.equals(array[i])){
                System.out.println(i);
            }
        }
    }
}