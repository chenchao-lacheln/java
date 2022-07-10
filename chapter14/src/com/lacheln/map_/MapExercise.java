package com.lacheln.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * MapExercise
 * 练习题
 * @author lacheln
 * @date 2022/7/10 11:03
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        /**
         * 使用HashMap添加3个员工对象，要求
         * 键:员工id
         * 值:员工对象
         * 并遍历显示工资> 1 8000的员工(遍历方式最少两种)
         * 员工类:姓名、工资、员工id
         */
        Map hashMap = new HashMap();
       hashMap.put(1, new Emp("lacheln", 30000, 1));
       hashMap.put(2, new Emp("Tom", 1000, 2));
       hashMap.put(3, new Emp("jack", 500, 3));

       //2种遍历方式
        //并遍历显示工资> 1 8000的员工(遍历方式最少两种)
        //1.使用keySet -> 增强for
        Set keySet = hashMap.keySet();
        System.out.println("====第一种遍历方式====");
        for (Object key : keySet) {
            //先获取value
            Emp emp = (Emp) hashMap.get(key);
            if (emp.getSal() > 18000){
                System.out.println(emp);
            }
        }

        //2.使用EntrySet -> 迭代器
        Set entrySet = hashMap.entrySet();
        System.out.println("====第二种遍历方式====");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getClass()); // 真正的运行类型是 -->>HashMap$Node
            //通过 entry 取得key 和 value
            Emp emp = (Emp) entry.getValue();
             if (emp.getSal() > 18000){
                 System.out.println(emp);
             }


        }


    }
}

class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
