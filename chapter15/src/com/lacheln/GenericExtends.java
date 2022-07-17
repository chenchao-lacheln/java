package com.lacheln;

import java.util.ArrayList;
import java.util.List;

/**
 * GenericExtends
 * 泛型的继承与通配符
 * @author lacheln
 * @date 2022/7/17 22:46
 * @since 1.0.0
 */
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xxx");
        //泛型没有继承性
        //List<Object> list = new ArrayList<String>();

        //举例说明下面3个方法的使用
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        //如果是 List<?> c，可以接受任意的泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //List<? extends AA> c 表示上限，可以接受 AA或者AA的子类
        //printCollection2(list1);//错误
        //printCollection2(list2);//错误
        printCollection2(list3);//ok
        printCollection2(list4);//ok
        printCollection2(list5);//ok

        //List<? super AA> c 支持AA类，以及AA类的父类，不限于直接父类，
        printCollection3(list1);//ok
        //printCollection3(list2);//错误
        printCollection3(list3);//ok
        //printCollection3(list4);//错误
        //printCollection3(list5);//错误
    }

    // List<?> 表示任意的泛型都可以接受
    public static void printCollection1(List<?> c){
        for (Object o : c) { //通配符，取出时就是Object
            System.out.println(o);
        }
    }

    //? extends AA 表示上限，可以接受 AA或者AA的子类
    public static void printCollection2(List<? extends AA> c) {
        for (Object o : c) { //通配符，取出时就是Object
            System.out.println(o);
        }
    }

    //? super AA 子类类名AA：支持AA类，以及AA类的父类，不限于直接父类，
    //规定了泛型的下限
    public static void printCollection3(List<? super AA> c) {
        for (Object o : c) { //通配符，取出时就是Object
            System.out.println(o);
        }
    }

}

class AA {}
class BB extends AA {}
class CC extends BB {}
