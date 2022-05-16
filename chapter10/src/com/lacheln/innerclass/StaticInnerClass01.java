package com.lacheln.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        //外部其他类 使用静态内部类
        // 方式1
        //静态内部类 是可以直接通过类名进行访问的（前提是满足访问权限））
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        // 方式2
        // 编写一个方法，可以返回静态内部类的对象实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();

        // 方式3
        // 编写一个静态方法，可以不用创建对象，直接通过外部类名 进行访问
        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        inner10_.say();

    }
}
class Outer10 {//外部类
    private int n1 = 100;
    private static String name = "张三";
    private static void cry(){}

    //Inner10 就是一个静态内部类
    /*
    1.放在外部成员的位置
    2.使用static修饰
    3.可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
    4.可以添加任意访问修饰符（public protected 默认 private），因为他的地位就是一个成员
    5.作用域：同其他成员，为整个类体
     */
    public  static  class Inner10 {
        private static String name = "刘备";
        public void say(){
            //如果外部类和静态内部类的成员重名时，静态内部访问时，默认遵循就近原则，如果想访问外部类成员，
            //使用外部类名.成员 去访问
            System.out.println(name + "  外部类 name = " +Outer10.name);
            cry();
        }
    }

    public void m1(){
        //外部类 访问 静态内部类 访问方式：创建对象 再访问
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    //非静态方法
    public Inner10 getInner10(){
        return new Inner10();
    }

    //静态方法
    public static Inner10 getInner10_(){
        return new Inner10();
    }
}