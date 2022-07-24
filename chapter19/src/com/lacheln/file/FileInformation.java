package com.lacheln.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * FileInformation
 * 获取文件相关信息
 * @author lacheln
 * @date 2022/7/25 01:01
 * @since 1.0.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    //获取文件信息
    @Test
    public void info(){
        //创建文件对象
        File file = new File("/Users/lacheln/learn/java/javaPrac45/news1.txt");

        //调用相应方法，得到对应信息
        //1.获取文件名 getName
        System.out.println("文件名 = " + file.getName());
        //2.得到绝对路径 getAbsolutePath()
        System.out.println("绝对路径 = " + file.getAbsolutePath());
        //3.文件父级目录 getParent()
        System.out.println("文件父级目录 = " + file.getParent());
        //4.文件大小（字节） length()
        System.out.println("文件大小 = " + file.length());
        //5.文件是否存在 exists()
        System.out.println("文件是否存在 = " + file.exists()); //true
        //6.是不是一个文件 isFile()
        System.out.println("是不是一个文件 = " + file.isFile()); //true
        //7.是不是一个目录 isDirectory()
        System.out.println("是不是一个目录 = " + file.isDirectory()); //false
    }
}
