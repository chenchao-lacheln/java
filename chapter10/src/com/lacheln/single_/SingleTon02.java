package com.lacheln.single_;

/**
 * 演示单例模式-懒汉式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        //演示单例模式-懒汉式，在进行其他属性调用的时候，且进行类加载的时候，是否会创建cat对象
//        System.out.println(Cat.n1);//99,构造器没有被调用
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        //再次调用getInstance
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
        System.out.println(instance == instance1);


    }
}

//希望在程序运行过程中，只能创建一直Cat对象
//单例模式
class Cat {
    private String name;
    public static int n1 = 99;
    private static Cat cat;//定义一个static静态属性,默认是null

    //步骤
    //1.构造器私有化
    //2.定义一个static静态属性
    //3.提供一个public的static方法，可以返回一个Cat对象
    //4.懒汉式，只有当用户使用getInstance时，才会返回Cat对象，后面再次调用时，会返回上次创建Cat对象
    // 从而保证了单例
    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance(){
        if (cat == null){//如果没有创建cat对象
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

