package com.chapter.seventh;

public class Homework04 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        A03 p1 = new A03();
        int[] res = p1.copyArr(array1);
        System.out.println("newArray = " + res);
    }
}

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
