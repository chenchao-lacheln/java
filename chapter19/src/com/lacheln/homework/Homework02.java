package com.lacheln.homework;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Homework02
 *
 * @author chaochen
 * @date 2023/5/30
 * @since 1.0.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        // TODO: 2023/5/30 如果文件的编码为gbk，出现中文乱码，如何解决？
        //1.默认是按照 utf-8处理，开始没有乱码
        //2. 提示：使用我们的转换流，将FilelnputStream-＞InputStreamReader[可以指定编码〕-> BufferedReader
        /**
         * 使用BufferedReader读取一个文本文件，为每行加上行号，再连同内容一井输出到屏幕上。
         */
        String filePath = "/Users/chaochen/tmp/mytemp/hello.txt";
        BufferedReader br = null;
        String line = "";
        int lineNum = 0;
        br = new BufferedReader(new FileReader(filePath));
        while ((line = br.readLine()) != null) { //循环读取
            System.out.println(++lineNum + " " + line);
        }
        if (br != null) {
            br.close();
        }


    }
}
