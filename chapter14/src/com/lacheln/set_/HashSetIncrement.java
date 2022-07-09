package com.lacheln.set_;

import java.util.HashSet;

/**
 * HashSetIncrement
 * 分析HashSet的扩容和转成红黑树机制
 * @author lacheln
 * @date 2022/7/9 22:39
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        /*
        1. HashSet底层是HashMap,第一次添加时，table 数组扩容到16,
            临界值(threshold)是16*加载因子(loadFactor)是0.75 = 12
        2.如果table数组使用到了临界值12,就会扩容到16*2 = 32,
            新的临界值就是32*0.75 = 24,依次类推
         */
        HashSet hashSet = new HashSet();

//        for (int i = 1;i <= 100;i++){
//            hashSet.add(i);//1,2,3,4,....,100
//        }

        // 3.在Java8中，如果条链表的元素个数到达TREEIFY THRESHOLD(默认是8 ),
        //            并且table的大小>=MIN TREEIFY CAPACITY(默认64),就会进行树化(红黑树),否则仍然采用数组扩容机制
        for (int i = 1;i <= 12;i++){
            hashSet.add(new A(i));
        }
        System.out.println("hashSet = " + hashSet);
    }
}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    //重写hashCode
    @Override
    public int hashCode() {
        return 100;
    }
}
