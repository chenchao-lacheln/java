package com.object_;

public class Finalize {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;// Cae对象没有任何的引用 Car对象就是一个垃圾,垃圾回收器就会回收对象，
        // 在回收对象钱，会调用该对象的finalize方法，我们可以在finalize方法中，写自己的业务逻辑
        // 比如：释放资源：数据库连接，或者打开文件...
        //如果不重写finalize，就会调用Objectl类的finalize方法，即默认处理
        //重写即实现自己的业务逻辑
        System.gc();//主动调用垃圾回收器
        //程序退出了..
        //我们销毁汽车宝马
        //释放了某些资源...
        //System.gc() 程序调用gc方法的时候并不会阻塞在这里，调用这个方法的时候，还会继续往下走，执行下面的程序，直接执行了下面的代码，所以"程序退出了.. "先输出
        System.out.println("程序退出了.. ");

        //这里理论上是执行了finalize方法，输出" System.out.println("我们销毁汽车" + name)= System.out.println("释放了某些资源...");
        // 但是 直接输出  "程序退出了.. " 这句话，为什么？
        //Car("宝马") 这个对象确实成为一个垃圾了，但是垃圾回收器什么时候回收这个对象，并不是一变成垃圾，马上就会回收，如果是这样，垃圾回收器的性能会很低
        //并不是实时监控，而是有一个垃圾回收机制的算法
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    //重写finalize方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车" + name);
        System.out.println("释放了某些资源...");
    }
}
