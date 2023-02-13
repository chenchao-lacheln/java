package com.lacheln.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * BufferedWrite_
 *
 * @author chenchao
 * @date 2022/10/21 4:06 PM
 * @since 1.0.0
 * 演示BufferedWriter的使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/chenchao/tmp/ok.txt";
        //创建BufferedWriter
        // new FileWriter(filePath,true) 表示以追加的方式写入
        // new FileWriter(filePath) 表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("Hello,上海");
        bufferedWriter.newLine(); //插入一个和系统相关的换行
        bufferedWriter.write("Hello,北京");
        bufferedWriter.newLine(); //插入一个和系统相关的换行
        bufferedWriter.write("Hello,重庆");
        //输入一个换行符
        //说明：关闭外层流即可，传入的 new FileWriter(filePath) 会在底层关闭
        bufferedWriter.close();
    }
}
