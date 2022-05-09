package com.lacheln.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("哈喽");
        /*
        电影屏幕打开。。。。
        广告开始。。。。
        电影正式开始。。。。
        Movie(String name) 被调用
         */

    }
}

class Movie {
    private String name;
    private double price;
    private String directory;

    //3个构造器 重载
    /*
    1.下面的3个构造器都有相同的语句
    2.代码比较冗余
    3.可以将相同的语句，放入一个代码块中，即可
    4.无论调用哪个构造器，都会先调用代码块的内容
    5.代码块调用的优先级高于构造器
     */

    {
        System.out.println("电影屏幕打开。。。。");
        System.out.println("广告开始。。。。");
        System.out.println("电影正式开始。。。。");
    }
    public Movie(String name) {
        System.out.println("Movie(String name) 被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String directory) {
        this.name = name;
        this.price = price;
        this.directory = directory;
    }

}