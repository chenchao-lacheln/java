package com.lacheln.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        /*
         */
        Cellphone cellphone = new Cellphone();
        /*
        1.传递了一个实现了Bell接口的 匿名内部类 InnerClassExercise02$1
        2.重写了ring方法
        Bell bell = new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
         */
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });

    }
}

//接口
interface Bell{
    void ring();
}

//手机类
class Cellphone{
    public void alarmclock(Bell bell){ //形参是Bell接口类型
        bell.ring();
    }
}
