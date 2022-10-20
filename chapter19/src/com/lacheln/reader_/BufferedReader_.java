package com.lacheln.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReader_
 *
 * @author chenchao
 * @date 2022/10/20 11:20 AM
 * @since 1.0.0
 * 演示BufferedReader 的使用
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/chenchao/tmp/tcpdump.log";
        // 创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

    }
}
