package com.lacheln.transformmation;

import java.io.*;

/**
 * CodeQuestion
 *
 * @author chaochen
 * @date 2023/4/6
 * @since 1.0.0
 * 中文乱码问题
 */
public class CodeQuestion {
    public static void main(String[] args) throws Exception{
        /*
        读取/Users/chaochen/tmp/a.txt 文件到程序
        1.创建字符输入流 BufferedReader [处理流]
        2.使用 BufferedReader 对象读取a.txt
        3.默认情况下，读取文件是按照 utf-8 编码，则可以正常读取
        4.如果文件编码产生变化，比如：更改文件的编码格式为国标码ANSI
        5.因此需要指定编码格式，字节流可以指定编码格式，然后转换为字符流
         */

        String filePath = "/Users/chaochen/tmp/a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        //读取内容
        String s = br.readLine();
        System.out.println("读取到的内容：" + s);
        br.close();

//        InputStreamReader
//        OutputStreamWriter
    }
}
