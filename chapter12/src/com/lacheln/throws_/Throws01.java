package com.lacheln.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Throws01
 *
 * @author lacheln
 * @date 2022/5/29 14:44
 * @since 1.0.0
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void fi () throws FileNotFoundException,NullPointerException,ArithmeticException {
        //创建一个文件流对象
        /*
        1.这里的异常是一个FileNotFoundException 编译异常
        2.使用try-catch-finnal
        3.使throws，抛出异常，让调用f1方法的调用者(方法)处理
        4.throws后面的异常类型可以是方法中产生的异常类型，也可以是他的父类
        5.throws关键字后面 也可以是异常列表，即可以抛出多个异常
         */
        FileInputStream fileInputStream = new FileInputStream("d://aa.text");
    }
}

