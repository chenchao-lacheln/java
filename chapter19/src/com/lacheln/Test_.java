package com.lacheln;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Test_
 *
 * @author chenchao
 * @date 2022/10/18 5:28 PM
 * @since 1.0.0
 */
public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
//        bufferedReader_.readFiles(10);
        bufferedReader_.readFile(); //调用原始方法，只读取1次

//        ObjectInputStream
//        ObjectOutputStream
        //通过BufferReader_多次读取字符串
        BufferedReader_ bufferedReader_1 = new BufferedReader_(new StringReader_());
        bufferedReader_1.readStrings(6);
    }
}
