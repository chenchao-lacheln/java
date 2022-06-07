package com.lacheln.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("hello");

    }
}

//抽象方法不能用private  final  static（和重写无关） 修饰，因为这些关键字都和重写相违背
abstract class H{
    public abstract void hi();//抽象方法
}
//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非她自己也声明为abstract类
abstract class E {
    public abstract void hi();
}
abstract class F extends E{
    
}

class G extends E{
    @Override
    public void hi() {//实现了父类的抽象方法
        
    }
}
// 抽象类的本质还是类，所以可以有类的各种成员
abstract class D {
    public int n1 = 10;
    public static String name = "lacheln";
    public void hi(){
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok(){
        System.out.println("ok");
    };

}
