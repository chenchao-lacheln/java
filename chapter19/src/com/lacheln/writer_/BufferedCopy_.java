package com.lacheln.writer_;

import java.io.*;

/**
 * BufferedCopy_
 *
 * @author lacheln
 * @date 2022/10/30 10:11
 * @since 1.0.0
 * 使用BufferedReader和BufferedWriter完成文本文件的拷贝
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        //BufferedInputStream
        //BufferedOutputStream
        //注意
        // BufferedReader 和BufferedWriter 按照字符操作
        //不要去操作二进制文件(声音、视频、Doc文档)，操作二进制文件可能导致损坏
        String srcFilePath = "/Users/lacheln/tmp/amazing.txt";
        String destFilePath = "/Users/lacheln/tmp/amazing1.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            //readLine() 读取一行内容
            while ((line = br.readLine()) != null){
                //每读取一行，就写入一行
                bw.write(line);
                //插入一个换行符
                bw.newLine();
            }
            System.out.println("拷贝完毕~~");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null){
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
