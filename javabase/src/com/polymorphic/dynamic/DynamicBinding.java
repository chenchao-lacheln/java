package com.polymorphic.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();//向上转型
//        System.out.println(a.sum());//40
//        System.out.println(a.sum1());//30

        //1.把子类的sum方法注销了，以下输出什么？
        //当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
        System.out.println(a.sum());//30

        //2.把子类的sum1方法注销了，以下输出什么？
        //当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
        System.out.println(a.sum1());//20
    }
}

class A {//父类
    public int i = 10;

    //动态绑定机制
    //当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
    public int sum(){
        return getI() + 10;//getI()
    }
    public int sum1(){//父类的sum1方法
        return i + 10;//i属性  没有动态绑定机制-->//当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
    }
    public int getI(){//父类的getI
        return i;
    }
}
class B extends A {//子类
    public int i = 20;

//    public int sum(){
//        return getI() + 20;
//    }
    public int getI(){//子类的getI,重写了父类的方法
        return i;
    }
//    public int sum1(){
//        return i + 10;
//    }
}
