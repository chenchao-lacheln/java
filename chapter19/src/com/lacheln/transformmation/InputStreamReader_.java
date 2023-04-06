package com.lacheln.transformmation;

import java.io.*;

/**
 * InputStreamReader_
 *
 * @author chaochen
 * @date 2023/4/7
 * @since 1.0.0
 * 演示 使用 InputStreamReader 转换流 解决中文乱码问题
 * 将字节流 FileInputStream 转换成 字符流 InputStreamReader,指定编码 gbk/utf-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/chaochen/tmp/a.txt";
        /*
        1.把 FileInputStream 转成 InputStreamReader
        2.指定编码格式 UTF-8
         */
        // InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"UTF-8");
        //3.把 InputStreamReader 传入 BufferedReader 读取效率更高
        // BufferedReader br = new BufferedReader(isr);

        //将2和3合在一起
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"UTF-8"));
        //4.读取
        String s = br.readLine();
        System.out.println("读取到的内容：" + s);
        br.close();

    }
}
