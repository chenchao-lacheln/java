package com.polymorphic.detail_;

public class PloyDetail {
    public static void main(String[] args) {

        //向上转型：父类的引用指向了子类的对象
        //语法:父类类型 引用名 = new 子类类型()；
         Animal animal = new Cat();
        Object obj = new Cat();//Object是Animal的父类 也是cat的父类 可以进行引用

        //1.可以调用父类的所有成员（需遵守访问权限：比如private）
        //2.但不能调用子类的特有成员
        //3.因为在编译阶段，能调用哪些成员，是由编译类型来决定的
//        animal.catchMouse;错误
        //4.最终运行效果看子类（运行类型）的具体实现,即调用方法时，按照从子类（运行类型）开始查找方法，然后调用，规则和之前的方法调用规则一样
        animal.eat();//注意第3点，编译阶段是是编译类型决定的，但是运行的时候是由运行类型来决定的
        animal.run();
        animal.show();
        animal.sleep();

        /**
         * 实现调用Cat的catchMouse方法
         * 多态的向下转型
         * 1.语法：子类类型 引用名 = （子类类型）父类引用；
         */
        Cat cat = (Cat) animal;
        //cat的编译类型和运行类型是什么？编译类型Cat和运行类型Cat
        cat.catchMouse();

        //2.要求父类的引用必须指向的是当前目标类型的对象
        //2.1 Animal animal = new Cat();相当于animal这个对象引用指向堆里面的Cat对象
        //2.2 Cat cat = (Cat) animal; 进行强转以后，Cat这个引用对象也指向Cat对象
        //2.3 相当于现在有两个引用指向Cat对象，一个是父类的引用，一个是子类的引用

//        Dog dog = (Dog) animal;//错误的，相当于把猫转成狗
        //Exception in thread "main" java.lang.ClassCastException: com.polymorphic.detail_.Cat cannot be cast to com.polymorphic.detail_.Dog
        //	at com.polymorphic.detail_.PloyDetail.main(PloyDetail.java:34)
    }
}
