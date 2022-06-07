package com.lacheln.single_;
/**
 * 演示单例模式-饿汉式
 */

public class SingleTon01 {
    public static void main(String[] args) {
        //可以创建2个女朋友，就不是单例
        //GirlFriend girlFriend = new GirlFriend("花花");
        //GirlFriend girlFriend1 = new GirlFriend("兰兰");

        //通过方法获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance);
        System.out.println(instance == instance1);

        //演示为什么是饿汉式，
        // 使用n1这个静态变量，这个时候实际上我并没有使用到gf，
        // 但是我们在使用n1这个静态属性的时候，会导致GirlFriend这个类被加载，
        // 类加载意味着gf这个静态语句会被执行，构造器也会被调用，gf这个对象就有了
//        System.out.println(GirlFriend.n1);

    }
}

//有一个类GirlFriend
//只能有一个女朋友
class GirlFriend{

    private String name;
    public static int n1 = 100;

    //为了能够在静态方法中返回 gf 对象，需要将其修饰为static ，
    // 如果不修饰成static，则又需要new一个对象，而现在则不需要new，就可以直接调用了
    //饿汉式：就是还没用到gf这个对象，就已经被创建好了
    //对象，通常是重量级对象，该模式可能造成了创建对象，但是没有使用，导致了资源的浪费
    private static GirlFriend gf = new GirlFriend("花花");

    //如何保证我们只能创建一个 GirlFriend 对象
    //步骤[单例设计模式-饿汉式]
    //1.构造器私有化 【防止在类的外部直接创建】
    //2.在类的内部直接创建对象（该对象是static）
    //3.提供一个公共的static方法，返回gf对象
    private GirlFriend(String name) {
        System.out.println("GirlFriend 构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
