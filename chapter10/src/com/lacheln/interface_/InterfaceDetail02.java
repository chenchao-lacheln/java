package com.lacheln.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        //证明 接口中的属性，是public final static 修饰的
        System.out.println(IB.n1);//说明n1就是static
        //IB.n1 = 88;//Cannot assign a value to final variable 'n1'说明是final修饰的
        //public修饰的，可以在前面通过protected 和private修饰，都会报错，
        // 默认方法修饰，可以在方法中调用，会发现只能用public修饰
    }
}
interface IB{
    //接口中的属性，只能是final的，而且是public final static 修饰的
    int n1 = 99;//等价于public final static int n1 = 99;
    void hi();
};
interface IC{
    void ok();
};
//接口不能继承其他的类，但是可以继承多个别的接口
interface ID extends IB,IC{

}
//接口的修饰符只能是public 和默认，这点和类的修饰符是一样的
interface IE{};
//一个类可以同时实现多个接口
class Pig implements IB,IC {

    @Override
    public void hi() {

    }

    @Override
    public void ok() {

    }
}

