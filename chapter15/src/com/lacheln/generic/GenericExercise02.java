package com.lacheln.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * GenericExercise02
 *
 * @author lacheln
 * @date 2022/7/17 17:03
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new MyDate(11,23,2000)));
        employees.add(new Employee("jack",12000,new MyDate(1,23,2009)));
        employees.add(new Employee("lacheln",50000,new MyDate(10,10,1900)));
        System.out.println("employees = " + employees);

        System.out.println("====排序====");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先按照name排序，如果name相同，则按生日日期的先后排序。[即: 定制排序)
                //先对传入的参数进行验证
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确...");
                    return 0;
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0){
                    return i;
                }
                return emp1.getBirthday().compareTo(emp2.getBirthday());
                //下面是对birthday的比较，因此，我们最好把这个比较，放在MyDate类完成
//                //如果 name 相同，就比较birthday - year
//                int yearMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
//                if (yearMinus != 0){
//                    return yearMinus;
//                }
//                //如果year相同，就比较month
//                int monthMinus = emp1.getBirthday().getMonth() - emp2.getBirthday().getMonth();
//                if (monthMinus != 0){
//                    return monthMinus;
//                }
//                //如果year和month都相同
//                return emp1.getBirthday().getDay() - emp2.getBirthday().getDay();
            }
        });
        System.out.println("====排序后的结果====");
        System.out.println(employees);
    }
}
/**
 * 定义Employee类
 * 1)该类包含: private成员变量name,sal,birthday, 其中birthday为MyDate类的对象;
 * 2)为每一个属性定义getter, setter方法;
 * 3)重写toString方法输出name, sal, birthday
 * 4) MyDate类包含: private成员变量month,day,year;并为每一个属性定义getter,setter方法;
 * 5)创建该类的3个对象，并把这些对象放入ArrayList集合中(ArrayList 需使用泛型来定义) ,对集合中的元素进行排序，并遍历输出:
 * 排序方式:调用ArrayList 的sort方法,传入Comparator对象[使用泛型]，先按照
 * name排序，如果name相同，则按生日日期的先后排序。[即: 定制排序)
 * 有一定难度,比较经典泛型使用案例
 */
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
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

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) { //把对 year-month-day比较放在这里

        int yearMinus = year - o.getYear();
        if (yearMinus != 0){
            return yearMinus;
        }
        //如果year相同，就比较month
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0){
            return monthMinus;
        }
        //如果year和month都相同
        return day - o.getDay();
    }
}