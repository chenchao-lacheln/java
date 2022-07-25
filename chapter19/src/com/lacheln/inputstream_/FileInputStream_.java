package com.lacheln.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream_
 * FileInputStream 的使用（字节输入流 文件-->>程序）
 * @author lacheln
 * @date 2022/7/25 02:18
 * @since 1.0.0
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 读取文件
     * 单个字节的读取，效率比较低
     * -> 使用 read(byte[] b) 读取 效率较高
     */
    @Test
    public void readFile01(){
        String filePath = "/Users/chenchao/personal/java/hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用户读取文件
            fileInputStream = new FileInputStream(filePath);
            // read() 从该输入流读取一个字节数据，如果没有输入可用，此方法将被阻止，
            // 如果返回-1，表示读取完毕
            while ((readData = fileInputStream.read()) != -1){
                System.out.print((char) readData);//转成char显示
            }
        } catch (IOException e) { // FileNotFoundException -->> IOException
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
