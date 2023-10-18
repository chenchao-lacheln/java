package com.lacheln.transformmation;

import java.io.*;

/**
 * OutputStreamWriter_
 *
 * @author chaochen
 * @date 2023/4/7
 * @since 1.0.0
 * 演示 OutputStreamWriter 的使用
 * 把 FileOutputStream 字节流 ， 转换成 字符流 OutputStreamWriter
 * 指定处理编码 gbk/utf-8/utf8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/chaochen/tmp/writer.txt";
        String charset = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charset);
        osw.write("hello,超哥");
        osw.close();
        System.out.println("按照" + charset + "编码保存文件成功");

//        PrintStream
//        PrintWriter
    }
}
