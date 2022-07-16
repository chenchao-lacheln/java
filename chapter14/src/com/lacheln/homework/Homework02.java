package com.lacheln.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Homework02
 *
 * @author lacheln
 * @date 2022/7/16 21:10
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        //使用ArrayList完成对对象Car {name, price}的各种操作
        //1.add:添加单个元素
        list.add(car);
        list.add(car2);
        System.out.println("list = " + list);
//        //2.remove:删除指定元素
//        //list.remove(1);
//        list.remove(car);
//        System.out.println("list = " + list);
//        //3.contains:查找元素是否存在
//        System.out.println(list.contains(car));//F
//        //4.size:获取元素个数
//        System.out.println(list.size());//1
//        //5.isEmpty:判断是否为空
//        System.out.println(list.isEmpty());//F
//        //6.clear:清空
////        list.clear();
////        System.out.println("list = " + list);
//        //7.addAlI:添加多个元素
//        list.addAll(list);//2个宾利
//        System.out.println("list = " + list);
//        //8.containsAll:查找多个元素是否都存在
//        System.out.println(list.containsAll(list));//T
//        //9.removeAl:删除多个元素
//        System.out.println(list.removeAll(list));//相当于清空
//        System.out.println("list = " + list);
        //使用增强for和迭代器来遍历所有的car，需要重写Car的toString方法
        System.out.println("====使用增强for循环遍历====");
        for (Object o : list){
            System.out.println(o);
        }
        System.out.println("====使用迭代器遍历====");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
