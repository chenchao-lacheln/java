package com.lacheln.innerclass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        //演示
        Outer01 outer01 = new Outer01();
        outer01.hi();
    }
}

class Outer01 {
    private int n1 = 100;
    public void hi(){//方法
        //1.局部内部类是定义在外部内的局部位置，通常是在方法
        //3.不能添加访问修饰符，但是可以使用final修饰(加上final后，就不可以被继承了)
        //3.作用域：仅仅在定义他的方法或者代码块中
        final class Inner01{//局部内部类(本质还是一个类)
            //2.可以直接访问外部类的所有成员，包括私有的
            public void f1(){
                //5.局部内部类可以直接访问外部类的成员，比如下面
                System.out.println("n1 = " + n1);
                m2();
            }
        }
        //class Inner02 extends Inner01{}
        //6.外部类在方法中，可以创建Inner01对象，然后调用方法即可
        Inner01 inner01 = new Inner01();
        inner01.f1();
    }
    private void m2(){
        System.out.println("Outer01 m2");
    }//私有方法
    {//代码块
        class Inner02{

        }
    }
}