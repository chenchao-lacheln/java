package com.lacheln.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Director_
 * 目录操作
 * @author lacheln
 * @date 2022/7/25 01:14
 * @since 1.0.0
 */
public class Director_ {
    public static void main(String[] args) {

    }
    //1.判断 /Users/lacheln/learn/java/javaPrac45/news1.txt 是否存在，如果存在就删除
    @Test
    public void m1(){
        String fileName = "/Users/lacheln/learn/java/javaPrac45/news1.txt";
        File file = new File(fileName);
        if (file.exists()){
            if (file.delete()){ // delete()返回Boolean
                System.out.println("文件删除成功");
            }else {
                System.out.println("文件删除失败");
            }
        }else {
            System.out.println("该文件不存在...");
        }
    }

    //2.判断 /Users/lacheln/learn/java/javaPrac45/demo 是否存在，如果存在就删除
    //java中，目录也被当做一种文件
    @Test
    public void m2(){
        String fileName = "/Users/lacheln/learn/java/javaPrac45/demo";
        File file = new File(fileName);
        if (file.exists()){
            if (file.delete()){ // delete()返回Boolean
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该目录不存在...");
        }
    }

    //3.判断 /Users/lacheln/learn/java/javaPrac45/demo 是否存在，如果存在就提示已存在，否则就创建
    @Test
    public void m3(){
        String directorName = "/Users/lacheln/learn/java/javaPrac45/demo/a/b";
        File file = new File(directorName);
        if (file.exists()){
            System.out.println(directorName + " 存在...");
        }else {
            if (file.mkdirs()){ // 创建多级目录 用 mkdirs() ，创建1级目录 用 mkdir()
                System.out.println(directorName + "创建成功..");
            }else {
                System.out.println(directorName + "创建失败..");
            }
        }
    }
//    InputStream
//    OutputStream
//    Reader
//    Writer
}
