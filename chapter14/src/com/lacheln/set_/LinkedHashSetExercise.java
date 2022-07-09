package com.lacheln.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * LinkedHashSetExercise
 *
 * @author lacheln
 * @date 2022/7/10 00:25
 * @since 1.0.0
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        /**
         * Car类(属性:name,price),如果name和price一样
         * 则认为是相同元素，就不能添加。
         */
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Car("奥拓",1000));
        set.add(new Car("奥迪",300000));
        set.add(new Car("法拉利",10000000));
        set.add(new Car("奥迪",300000));
        set.add(new Car("保时捷",70000000));
        set.add(new Car("奥迪",300000));

        System.out.println("set = " + set);
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
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //重写equals方法和hashCode
    //当name和price相同时，就返回相同的hashCode值，equals返回True

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

