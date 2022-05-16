package com.lacheln.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.hi();
    }
}
class Outer05 {
    private int n1 = 99;
    public void hi(){
        //创建一个基于类的匿名内部类
        Person person = new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类 重写了hi方法");
            }
        };
        person.hi();//动态绑定，运行类型是 Outer05$1

        //也可以直接调用,匿名内部类本身也是返回一个对象
        //class 匿名内部类 extends Person{}
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类 重写了hi方法,hhhhh");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("lacheln");
    }
}
class Person {//类
    public void hi(){
        System.out.println("Person hi()");
    }
    public void ok(String str){
        System.out.println("Person ok()" + str );
    }
}

//抽象类/接口类