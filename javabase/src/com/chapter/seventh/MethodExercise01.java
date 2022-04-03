package com.chapter.seventh;

import java.util.Scanner;

public class MethodExercise01 {
    public static void main(String[] args) {
       AA a = new AA();
       if (a.isOddOrEven(1)){
           System.out.println("是奇数");
       }else {
           System.out.println("是偶数");
       }

       AA b = new AA();
       b.print(4,4,'*');
    }
}

class AA{
    public boolean isOddOrEven(int num){
//第一种方法
//        if (num % 2 != 0){
//            return true;
//        }else {
//            return false;
//        }

//      第二种方法
//        return num % 2 != 0 ? true: false;

//        第三种方法
        return  num % 2 != 0;
    }

    public void print(int row, int clo, char c){
        for (int i = 0; i < row;i++){
            for (int j = 0;j < clo; j++){// 输出每一行
                System.out.print(c);
            }
            System.out.println();//换行
        }
    }
}