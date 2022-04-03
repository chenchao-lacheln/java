package com.chapter.seventh;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
//    double[] array1 = {1.1,2.2,99.9,3.3,4.4};
//    double[] array2 = null;
    double[] array = {};


    A01 a01 = new A01();
    //接收一个包装类的对象
    Double res = a01.max(array);
    if (res != null) {
            System.out.println("array数组的最大值 = " + res);
        }else {
            System.out.println("array的输入有误！");
        }
    }
}
class A01 {
    //Double是一个包装类
    public Double max(double[] array) {
        //健壮性考虑
        //先判断array是否为空，否则array传null的时候会报空指针，null.length > 0
        //再判断array的数组必须大于0，否则array传入控数组，即array{}，长度为0，会报错，数组越界
        if (array != null && array.length > 0) {

            //保证array至少有一个元素
            double max = array[0];//假定第一个元素是最大值
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        }else {
            //这里要考虑return的0.0 ，0.0也可能是最大值
            return null;
        }
    }
}