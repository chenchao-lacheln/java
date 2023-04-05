package com.lacheln.standard;

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
    }
}
