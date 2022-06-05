package com.lacheln.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ArrayExercise
 *
 * @author lacheln
 * @date 2022/6/4 23:42
 * @since 1.0.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘 20 年", 5);
        books[3] = new Book("java 从入门到放弃~", 300);

//        //（1）price从大到小排序
//        Arrays.sort(books, new Comparator() {
//            //这里是对Book数组排序，因此o1 和 o2就是Book对象
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book) o1;
//                Book book2 = (Book) o2;
//                //return book2.getPrice() - book1.getPrice();
//                //这里进行一个转换
//                double priceVal = book2.getPrice() - book1.getPrice();
//                if (priceVal > 0){
//                    return 1;
//                }else if (priceVal < 0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
        //（2）price从小到大排序
//        Arrays.sort(books, new Comparator() {
//            //这里是对Book数组排序，因此o1 和 o2就是Book对象
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book) o1;
//                Book book2 = (Book) o2;
//                //return book2.getPrice() - book1.getPrice();
//                //这里进行一个转换
//                double priceVal = book1.getPrice() - book2.getPrice();
//                if (priceVal > 0){
//                    return 1;
//                }else if (priceVal < 0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
        //（3）按照书名长度从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                //要求按照书名长度 从大道小进行排序
                return book2.getName().length() - book1.getName().length();
            }
        });

        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
