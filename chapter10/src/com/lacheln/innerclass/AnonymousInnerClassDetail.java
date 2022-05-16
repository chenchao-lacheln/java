package com.lacheln.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.hi();

        System.out.println("main outer05 hashcode = " +outer05);
    }
}
class Outer05 {
    private int n1 = 99;
    public void hi(){
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符， 因为他的地位就是一个局部变量
        //作用域：仅仅在定义他的方法或者代码块中，仅仅只能使用一次
        Person person = new Person(){
            private int n1 = 88;
            @Override
            public void hi() {
                //可以直接访问外部类的所有成员，包含私有的
                //如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类成员，
                //  使用外部类名.this.成员 去访问
                //Outer05.this这个是外部类的一个对象，即outer05
                System.out.println("匿名内部类 重写了hi方法 n1 = " + n1 + " 外部类的n1 = " + Outer05.this.n1);
                //证明：Outer05.this 就是调用hi 的对象
                System.out.println("Outer05.this hashcode = " +Outer05.this);
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