package com.lacheln.standard;

import java.util.Scanner;

/**
 * InputAndOutput
 *
 * @author chaochen
 * @date 2023/4/6
 * @since 1.0.0
 */
public class InputAndOutput {
    public static void main(String[] args) {
        // 源码：System 类 的 public final static InputStream in = null;
        /*
        System.in的 编译类型 是 InputStream
        System.in的 运行类型 是 BufferInputStream
        表示的是标准输入 键盘
         */
        //class java.io.BufferedInputStream
        System.out.println(System.in.getClass());

        /*
        System 类 的 public final static PrintStream out = null;
        System.out的 编译类型 是 PrintStream
        System.out的 运行类型 是 PrintStream
        表示的是标准输出 显示器
         */
        //class java.io.PrintStream
        System.out.println(System.out.getClass());

        /*
        总结 ：System.in 和  System.out 其实分别对应我们的输入流和输出流
         */


        System.out.println("hello world");
        /*
        为什么调用 println 后，会打印在显示器上？
        因为out 表示的是标准输出 显示器
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容");
        String next = scanner.next();
        System.out.println("next = " + next);
        /*
        这里其实就是传入的 BufferInputStream  ，而 System.in 表示的是标准输入 键盘
        所以当我们输入数据的时候， Scanner 会到我们的控制台去获取键盘输入的数据，
         */
    }
}
