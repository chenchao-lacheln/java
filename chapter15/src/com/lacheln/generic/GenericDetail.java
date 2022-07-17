package com.lacheln.generic;

import java.util.ArrayList;

/**
 * GenericDetail
 *
 * @author lacheln
 * @date 2022/7/17 13:55
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class GenericDetail {
    public static void main(String[] args) {
        //1.泛型指向数据类型，要求是引用类型，不能是基本数据类型
        ArrayList<Integer> integers = new ArrayList<Integer>();//ok
        //Type argument cannot be of primitive type
        //ArrayList<int> ints = new ArrayList<int>();//错误

        //2.在给泛型指定具体类型后，可以传入该类型或者其子类型
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<B> bPig = new Pig<>(new B());
        bPig.f();

        //3.泛型的使用形式
        ArrayList<Integer> list = new ArrayList<Integer>();
        //实际开发中，会简写,推荐写法
        //编译器会进行类型推断
        ArrayList<Integer> list1 = new ArrayList<>();

        //4.如果是这样写，泛型默认是Object
        ArrayList list2 = new ArrayList(); //等价于ArrayList<Object> list2 = new ArrayList<>();
        list2.add("xxx");
        /*
        public boolean add(E e) { // E 就相当于 Object
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
         */


    }
}

class A {};
class B extends A {};
class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
    public void f (){
        System.out.println(e.getClass());
    }
}
