package com.lacheln.outputstream;

import java.io.*;

/**
 * FileCopy
 *
 * @author lacheln
 * @date 2022/7/26 22:27
 * @since 1.0.0
 */
public class FileCopy {
    public static void main(String[] args) {
        /*
        完成文件拷贝，将 /Users/lacheln/learn/java/javaPrac45/wb.png 拷贝到 /Users/lacheln
        1.创建文件输入流，将文件读入到程序
        2.创建文件输出流，将读取到的文件数据，写入到指定文件
         */
        String srcFilePath = "/Users/lacheln/learn/java/javaPrac45/wb.png";
        String destFilePath = "/Users/lacheln/web2.png";
        FileInputStream  fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组，提高读取效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1){
                //读取到后，就写入文件 通过fileOutputStream
                //即，一边读，一边写
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝Ok~");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭输入流和输出流 释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
//        Writer
//        Reader
    }
}
