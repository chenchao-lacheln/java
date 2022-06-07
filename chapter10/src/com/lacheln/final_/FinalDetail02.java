package com.lacheln.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        //没有加final的时候，会导致BBB这个类加载，导致静态代码块被执行
        System.out.println(BBB.num);

        //包装类,String是final类，不能被继承
//        String
//        double
    }
}

//final 和 static搭配，往往效率更高，不会导致类加载，底层编译器做了优化处理
class BBB {
    /*
    1.没有加final的时候，会导致BBB这个类加载，导致静态代码块被执行（BBB 的静态代码块被执行.../10000）
    2.加上final后，不会导致类加载（10000）
     */
    public  static int num = 10000;
    static {
        System.out.println("BBB 的静态代码块被执行...");
    }
}
final class AAA {
    //一般来说，如果一个类已经是final类就没有必要再将方法修饰成final方法
    //public final void cry(){}
}
