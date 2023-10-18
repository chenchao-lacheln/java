package com.lacheln.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * PrintStream_
 *
 * @author chaochen
 * @date 2023/4/7
 * @since 1.0.0
 * 演示 PrintStream 字节打印流，本质还是输出流，所以根据需求 修改输出数据的位置
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是标准输出，即 显示器
        /*
        println 的源码
            public void print(String s) {
                if (s == null) {
                    s = "null";
                }
                write(s);
            }
         */
        out.print("hello , chao");
        //因为 print 的底层使用的write方法，所以 我们可以直接调用 write进行打印/输出
        out.write("hello, chen".getBytes());
        out.close();

        // 修改打印流输出的位置/设备
        //1.输出修改成到  /Users/chaochen/tmp/out.txt
        //2."hi , boy !" 就会输出到 /Users/chaochen/tmp/out.txt 这个文件
        /*
        setOut 源码
        public static void setOut(PrintStream out) {
            checkIO();
            setOut0(out);   // native方法，修改了 out
        }
         */
        System.setOut(new PrintStream("/Users/chaochen/tmp/out.txt"));
        System.out.println("hi , boy !");

    }
}
