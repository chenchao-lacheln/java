package com.lacheln.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * PrintWrite_
 *
 * @author chaochen
 * @date 2023/4/7
 * @since 1.0.0
 * 演示 PrintWrite 使用
 */
public class PrintWrite_ {
    public static void main(String[] args) throws IOException {
//        PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("/Users/chaochen/tmp/printWriter.txt"));
        printWriter.print("hello，girl");
        //注意一定要close，close源码才是真正的写入内容，否则文件里面不会刷新内容
        printWriter.close(); // flush + 关闭流，才会将数据写入文件
    }
}
