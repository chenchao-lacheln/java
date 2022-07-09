package com.lacheln.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * HashSetExercise01
 *
 * @author lacheln
 * @date 2022/7/9 23:22
 * @since 1.0.0
 */
public class HashSetExercise01 {
    public static void main(String[] args) {
        /**
         * 定义一个Employeee, 该类包含: private成员属性name,sal,birthday(MyDate类型)，
         * 其中birthday为MyDate类型(属性包括: year, month, day),要求:
         * 1.创建3↑Employeef放入HashSet中
         * 2. 当name和birthday的值相同时，认为是相同员工，不能添加到HashSet集合中
         */
        HashSet hashSet = new HashSet();
    }
}

class Employeee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employeee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    //重写hashCode和equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeee employeee = (Employeee) o;
        return Objects.equals(name, employeee.name) && Objects.equals(birthday, employeee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}