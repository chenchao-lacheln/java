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
        /*
        基于接口的匿名内部类
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
    }
    public void test(){//方法
        
    }
}