package com.lacheln.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        new EE().cal();
    }
}
class AA {
    /*
    1.定义式，如：public final double TAX_RATE = 0.08;
    2.在构造器中
    3.在代码块中
     */
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    //构造器
    public AA(){
        TAX_RATE2 = 0.09;
    }

    //代码块
    {
        TAX_RATE3 = 0.01;
    }
}

class BB {
    /*
    如果final修饰的属性时静态的，则初始化的位置只能是
    1.定义式
    2.静态代码块中
    3.不能在构造器中
     */
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE1;
//    public static final double TAX_RATE2;

    /*
    构造器是在创建对象的时候，才会被触发，
    而静态变量是在类加载的时候就需要给值，
    所以类加载了没有值是不被允许的。
     */
    public BB() {
//        TAX_RATE2 = 3.3;
    }

    static {
        TAX_RATE1 = 88.8;
    }
}

//final类不能继承，但可以实例化对象
final class CC {}

//如果类不是final类，但是含有final方法，则该方法虽然不能被重写，但可以被继承
//即，仍然遵守继承机制
class DD {
    public final void cal(){
        System.out.println("cal()方法");
    }
}
class EE extends DD{

}
