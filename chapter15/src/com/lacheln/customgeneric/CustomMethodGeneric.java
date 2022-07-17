package com.lacheln.customgeneric;

import java.util.ArrayList;

/**
 * CustomMethodGeneric
 * 泛型方法的使用
 * @author lacheln
 * @date 2022/7/17 22:01
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        //2.当泛型方法被调用时，类型会被确定
        //当调用方法时，传入参数，编译器，就会确定类型
        car.fly("上天",100);

        // T是String R 是ArrayList
        //测试 ： 泛型方法可以使用类声明的泛型，也可以使用自己声明的泛型
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.2);

    }
}

//1.泛型方法可以定义在普通类中，也可以定义在泛型类中
//1.1 定义在普通类中
class Car { //普通类
    public void run (){ //普通方法
    }
    //1. <T , R> 方向标识符
    //2.提供给 fly使用
    public <T , R> void fly(T t,R r){//泛型方法
        System.out.println(t.getClass()); //STring
        System.out.println(r.getClass()); //Integer 泛型 自动装箱
    }
}

//1.2 定义在泛型类中
class Fish<T, R> { //泛型类
    public void run (){ //普通方法
    }
    public <U, M> void eat (U u,M m){ //泛型方法
    }

    //3.public void eat(E e) {}, 修饰符后没有<T,R..> eat 方法不是泛型方法，而是使用了泛型
    //3.1.下面hi方法不是泛型方法
    //3.2.是hi方法使用了类声明的 泛型
    public void hi (T t){
    }

    //4.泛型方法可以使用类声明的泛型，也可以使用自己声明的泛型
    //T t 是类声明的泛型，K是自己声明的泛型
    public <K> void hello(R r, K k){
        System.out.println(r.getClass()); //ArrayList
        System.out.println(k.getClass()); //Double
    }
}