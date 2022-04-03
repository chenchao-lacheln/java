package com.chapter.seventh;

public class Homework03 {
    public static void main(String[] args) {
        double price1 = 0;
        Book b1 = new Book();
        double res = b1.updatePrice(price1);
        System.out.println(res);
    }
}

class Book{
    public double updatePrice(double price){
        if (price > 100 ) {
            if (price > 150) {
                price = 150;
            } else if (price > 100 && price < 150) {
                price = 100;
            }
        }else {
            System.out.println("您的价格低于100元，价格保持不变！");
        }
        return price;
    }
}