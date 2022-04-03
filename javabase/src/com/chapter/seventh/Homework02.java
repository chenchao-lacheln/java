package com.chapter.seventh;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
//        String[] array = {"aaa","bbbb","ccc","rrr","kkkk"};
        String[] array = {};
        A02 p2 = new A02();
        int index = p2.find("kkkk",array);
        if (index == -1){
            System.out.println("您查询的数据不存在！");
        }else {
            System.out.println("您查询的数据存在，index = " + index);
        }
    }
}
//编写类A02，定义方法find，实现查找某字符串数组中的元素，并返回索引，如果找不到，返回01；
class A02 {
    public int find(String findStr,String[] strs){
        for (int i = 0;i < strs.length;i++){
            if (findStr.equals(strs[i])){
                return i;
            }
        }
        return -1;
    }
}