package com.lacheln.reader_;


import org.junit.jupiter.api.Test;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader_
 * 试用FileReader 从story.txt 读取内容
 * @author chenchao
 * @date 2022/10/17 5:29 PM
 * @since 1.0.0
 */
public class FileReader_ {
    public static void main(String[] args) {

    }

    /**
     * 单个字符读取文件
     */
    @Test
    public void readFile01(){
        String filePath = "/Users/chenchao/tmp/story.txt";
        // 1.创建FileReader对象
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read，单个字符读取
            while ((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 字符数组读取文件
     */
    @Test
    public void readFile02(){
        String filePath = "/Users/chenchao/tmp/story.txt";
        // 1.创建FileReader对象
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            // 循环读取 使用read(buf)，返回的是实际读取到的字符数
            // 如果返回-1说明文件读取结束
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
