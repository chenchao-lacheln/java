package com.lacheln.homework;

/**
 * Homework04
 *
 * @author lacheln
 * @date 2022/5/23 02:09
 * @since 1.0.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        /*
        1.匿名内部类是
                new ICalculate() {
                            @Override
                            public double work(double n1, double n2) {
                                return n1 + n2;
                            }
                        }
          同时也是一个对象

         */
        cellphone.testDork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);
    }
}
//编写接口
interface ICalculate {
    //work方法时完成计算
    //至于该方法完成怎样的计算，我们交给匿名内部类完成
    public double  work(double n1,double n2);
}

class Cellphone {
    //当我们调用testDork方法时，直接传入一个实现了ICalculate接口的匿名内部类即可
    //该匿名内部类，可以灵活的实现work方法，完成不同的计算任务
    public void testDork(ICalculate iCalculate,double n1,double n2){
        double result = iCalculate.work(n1, n2);
        System.out.println("计算后的结果 = " + result);
    }
}