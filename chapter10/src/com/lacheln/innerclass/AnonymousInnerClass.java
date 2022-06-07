package com.lacheln.innerclass;

/**
 * 演示匿名内部类的使用
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04{//外部类
    private int n1 = 10;// 属性
    public void method(){//方法
        /**
        演示基于接口的匿名内部类
        1.需求： 要使用IA接口，并创建对象
        2.传统方法，是写一个类，实现改接口，并创建对象
        3.需求：Tiger/Dog类只使用一次，后面再也不使用了（传统方法会定义很多类,很繁琐）
        4.可以使用匿名内部类来简化开发
        5.tiger 的编译类型是 ？ IA
        6.tiger 的运行类型是 ?  就是匿名内部类XXXX => Outer04$1
           我们看底层 会分配类名 Outer04$1
           class XXXX implements IA{
               @Override
                public void cry() {
                    System.out.println("老虎叫唤....");
                }
            }
         7.jdk底层在创建匿名内部类 Outer04$1，马上就创建了 Outer04$1实例，
         并且把地址返回给了tiger
         8.匿名内部类使用1次，就不能再次使用
         */
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤....");
            }
        };
        System.out.println("tiger的运行类型 = " + tiger.getClass());//getClass()获取对象的运行类型
        tiger.cry();
//        IA tiger = new Tiger();
//        tiger.cry();

        /**
         * 演示基于类的匿名内部类
         * 1. father的编译类型是 Father
         * 2.father的运行类型是 Outer04$2
         * 3.底层会创建匿名内部类
         *   class Outer04$2 extends Father{
         *          @Override
         *             public void test() {
         *                 System.out.println("匿名内部类重写了test方法");
         *             }
         *   }
         *  4.同时，也直接返回了 匿名内部类 Outer04$2的 对象
         *  5.注意，("lacheln") 参数列表，会传递给构造器
         */
        Father father = new Father("lacheln"){
            @Override
            public void test() {
                System.out.println("基于类的匿名内部类，重写了test方法");
            }
        };
        System.out.println("father对象的运行类型是 = " + father.getClass());
        father.test();

        /**
         * 基于抽象类的匿名内部类
         */
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("基于抽象类的匿名内部类，重写了eat方法");
            }
        };
        animal.eat();
    }
}

interface IA {//接口
    public void cry();
}
//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤....");
//    }
//}
//class Dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗叫唤... ");
//    }
//}
class Father{//类
    public Father(String name){//构造器
        System.out.println("接收到的name = " + name);
    }
    public void test(){//方法
        
    }
}

abstract class Animal{//抽象类
    abstract void eat();
}