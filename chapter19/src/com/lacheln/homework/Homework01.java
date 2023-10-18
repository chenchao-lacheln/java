package com.lacheln.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * homework01
 *
 * @author chaochen
 * @date 2023/5/30
 * @since 1.0.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {

        /**
         * (1）在判断e盘下是否有文件夹mytemp，如果没有就创建mytemp
         * (2) 在e:llmytemp 目录下，创建文件 hello.txt
         * (3)如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
         * (4） 井且在hello.txt 文件中，写入 hello,world~
         */
        String directoryPath = "/Users/chaochen/tmp/mytemp";
        File file = new File(directoryPath);
        //创建目录
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println(directoryPath + " 创建成功～");
            } else {
                System.out.println(directoryPath + " 创建失败～");
            }
        } else {
            System.out.println(directoryPath + " 已经存在，不再重复创建～");
        }

        String filePath = directoryPath + "/hello.txt";
        file = new File(filePath);
        //创建文件
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println(filePath + " 创建成功～");

                //如果文件存在，就使用BufferedWriter 字符输入流，写入内容
                BufferedWriter bf = new BufferedWriter(new FileWriter(filePath));
                bf.write("hello, chao~~");
                bf.close();

            } else {
                System.out.println(filePath + " 创建失败～");
            }
        } else {
            System.out.println(filePath + " 已经存在，不再重复创建～");
        }
    }
}
