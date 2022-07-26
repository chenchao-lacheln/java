package com.lacheln.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * FileCreate
 * 创建文件
 * @author lacheln
 * @date 2022/7/24 04:28
 * @since 1.0.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //方式1 new filePath(String pathname)
    @Test
    public void create01(){
        String filePath = "/Users/lacheln/learn/java/javaPrac45/news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2 new File(File parent, String child) //根据父目录文件 + 子路径构成
    @Test
    public void create02(){
        File parentFile = new File("/Users/lacheln/learn/java/javaPrac45/");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3
    @Test
    public void create03(){
        String parentPath = "/Users/lacheln/learn/java/javaPrac45/";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
