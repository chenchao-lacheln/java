package com.lacheln.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
//        new IA();
    }
}

//接口不能被实例化
//接口中所有的方法是public方法，接口中抽象方法，可以不使用abstract修饰
//一个普通类实现接口，就必须将该接口所有方法都实现，可以使用option+return解决
//抽象类实现接口时，可以不实现接口抽象方法
interface IA{
    void say();
    void hi();
}

class Cat implements IA{//快捷键 ：option+return

    @Override
    public void say() {
    }
    @Override
    public void hi() {
    }
}
//抽象类实现接口时，可以不实现接口抽象方法
abstract class Tiger implements IA{
}
