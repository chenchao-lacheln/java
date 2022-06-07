package com.lacheln.stringbuffer_;

import java.util.Scanner;

/**
 * StringBufferExercise01
 *
 * @author lacheln
 * @date 2022/6/4 12:47
 * @since 1.0.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        //输入商品名称和商品价格，要求打印效果示例
        /*
        1.定义一个Scanner对象，接收用户输入
        2.使用StringBuffer的 insert方法，需要将String 转换成StringBuffer
        3.然后使用相关方法 进行字符串处理
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入商品价格：(比如：123.89)");
        String price = myScanner.next();
        StringBuffer sb = new StringBuffer(price);
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i-=3) {
             sb = sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
