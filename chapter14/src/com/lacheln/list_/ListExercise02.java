package com.lacheln.list_;

import java.util.*;

/**
 * ListExercise02
 *
 * @author chenchao
 * @date 2022/6/21 6:19 PM
 * @since 1.0.0
 */
public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add(new Book("红楼梦",100,"曹雪芹"));
        list.add(new Book("西游记",10,"吴承恩"));
        list.add(new Book("水浒传",9,"施耐庵"));
        list.add(new Book("三国",80,"罗贯中"));

//        System.out.println("图书馆有四本图书" + arrayList);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        //冒泡排序
        System.out.println("====排序后的结果====");
        bubbleSort(list);
        for (Object o : list) {
            System.out.println(o);
        }


    }
    public static void bubbleSort(List list) {
        int listSize = list.size();
        for (int i = 0;i < listSize - 1;i++){
            for (int j = 0;j < listSize - 1 -i;j++){
                //取出对象Book
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if (book1.getBookPrice() > book2.getBookPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}
/*
使用List的实现类添加三本图书，并遍历，打印如下效果
        名称:XX 价格:XX 作者:XX
        名称:XX 价格:XX 作者:XX
        名称:XX 价格:XX 作者:XX
        要求
        1)按价格排序，从低到高(使用冒泡法)
        2)要求使用ArrayList、LinkedList 和Vector三种集合实现
 */
class Book {
    private String bookName;
    private double bookPrice;
    private String author;

    public Book(String bookName, double bookPrice, String author) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + bookName + "\t\t价格：" + bookPrice + "\t\t作者：" + author;
    }
}
