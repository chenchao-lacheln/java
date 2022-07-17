package com.lacheln.generic;

import java.util.*;

/**
 * GenericExercise
 *
 * @author lacheln
 * @date 2022/7/17 13:33
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {
        //使用泛型的方式给HashSet放入3个学生对象
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("java",18));
        students.add(new Student("tom",10));
        students.add(new Student("lacheln",24));

        //遍历
        for (Student student : students) {
            System.out.println(student);
        }

        //使用泛型的方式给HashMap放入3个学生对象
        //K -> String V -> Value
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        /*
            public class HashMap<K,V> { }
         */
        hashMap.put("tom",new Student("tom",18));
        hashMap.put("java",new Student("java",10));
        hashMap.put("lacheln",new Student("lacheln",90));

        //遍历
        /*
             public Set<Map.Entry<K,V>> entrySet() {
                Set<Map.Entry<K,V>> es;
                return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
            }
         */
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        /*
        public final Iterator<Map.Entry<K,V>> iterator() {
            return new EntryIterator();
        }
         */
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }



    }
}
/**
 * 1.创建3个学生对象
 * 2.放入到HashMap中， 要求Key是String name, Value就是学生对象
 * 3.使用两种方式遍历
 */
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
