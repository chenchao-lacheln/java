package com.chapter.seventh;

public class Homework03 {
    public static void main(String[] args) {
        Book book = new Book("笑傲江湖",800);
        book.info();
        book.updatePrice();//更新价格
        book.info();
    }
}
/*
编写类book，定义方法updatePrice，实现更改某本书的价格，
具体：如果价格大于150，则更改为150，如果价格大于100，则更改为100；
分析：
1.类名：Book
2.属性：price，name
3.方法名：updatePrice
4.形参（）
5.返回值void
6.提供一个构造器
 */
class Book{
    String name;
    double price;
    //初始化一个构造器
    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice(){
        //如果方法中，没有price局部变量，this.price 等价于price
        if (this.price > 150){
            this.price = 150;
        }else if (this.price > 100){
            this.price = 100;
        }
    }

    //显示书籍清理
    public void info(){
        System.out.println("书名 = " + this.name + " 价格 = " + this.price);
    }
}