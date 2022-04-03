package com.chapter.seventh;

public class Homework04 {
    public static void main(String[] args) {
        int[] oddArray = {1,2,3};
        A03 a03 = new A03();
        int[] newArray = a03.copyArr(oddArray);
        //遍历newArray，验证
        System.out.println("====返回的newArray数组情况如下====");
        for (int i = 0;i < newArray.length;i++){
            System.out.print(newArray[i] + "\t");
        }
    }
}
/*
编写类A03，实现数组的复制功能copyArr，输入旧数组，返回新数组，新数组和旧数组保持一样

 */

class A03{
    public int[] copyArr(int[] oddArray){
        //定义新数组
        int[] newArray = new int[oddArray.length];
        //循环取出就数组的值，并赋值给新数组
        for (int i = 0;i < oddArray.length;i++){
            newArray[i] = oddArray[i];
        }
        return newArray;
    }
}
