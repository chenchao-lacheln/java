package com.lacheln.homework;

/**
 * Homework05
 *
 * @author lacheln
 * @date 2022/5/24 23:50
 * @since 1.0.0
 */
public class Homework05 {
    public static void main(String[] args) {

        A a = new A();
        a.hi();
    }
}

class A {
    private  String NAME = "marry";

    public void hi() {
        //局部内部类
        class B {
            //私有常量name
            private final String NAME = "lacheln";
            public void show(){
                //内部类和外部类属性重名时 用 外部类名.this.属性名
                System.out.println("NAME = " + NAME + "\n外部类NAME = " + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}
