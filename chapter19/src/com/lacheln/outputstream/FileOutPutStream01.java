package com.lacheln.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutPutStream01
 *
 * @author lacheln
 * @date 2022/7/25 21:21
 * @since 1.0.0
 */
public class FileOutPutStream01 {
    public static void main(String[] args) {

    }

    /**
     * 使用FileOutPutStream，将数据写到文件中
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writerFile(){
        String filePath = "/Users/lacheln/learn/java/javaPrac45/a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //得到 FileOutputStream 对象
            /*
            1.new FileOutputStream(filePath); 创建方式，写入的内容会覆盖原来的内容
            2.new FileOutputStream(filePath,true); 创建方式，写入的内容会追加到原来的内容的后面
             */
            fileOutputStream = new FileOutputStream(filePath ,true);
            //写入一个字节
//            fileOutputStream.write('H');

            //写入字符串
            String str = "hello.world";
            //str.getBytes() 可以把字符串 -->> 字节数组
//            fileOutputStream.write(str.getBytes());
            /*
            write(byte[] b,int off, int len) 将len字节从位移偏移量 off的指定字节数组
             */
            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
