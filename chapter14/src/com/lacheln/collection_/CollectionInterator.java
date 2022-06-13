package com.lacheln.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * CollectionInterator
 *
 * @author lacheln
 * @date 2022/6/14 01:19
 * @since 1.0.0
 */
public class CollectionInterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList clo = new ArrayList();
        clo.add(new Book("三国","罗贯中",10.1));
        clo.add(new Book("小李飞刀","古龙",5.1));
        clo.add(new Book("红楼梦","曹雪芹",34.6));

//        System.out.println("col = " + clo);

        //编译clo集合
        //1.先得到clo对应的迭代器
        Iterator iterator = clo.iterator();
        //2.使用while循环编译
        while (iterator.hasNext()){//判断是否还有数据
            //返回下一个元素，类型是Object
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
        //itit——快捷键 快速生成while
        //command + j  显示所有快捷键的快捷键
        //3.当退出while循环后，这时iterator迭代器，指向最后的元素，再次取会报错 NoSuchElementException
//        iterator.next();//报错：NoSuchElementException

        //4.如果需要再次遍历，需要重置迭代器
        iterator = clo.iterator();
        System.out.println("====第二次遍历====");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
