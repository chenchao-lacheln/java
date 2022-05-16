package com.lacheln.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {

        //当做实参直接传递，简洁高效(不需要创建对象，只用一次)，
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画...");//这里修改后，只会影响这个一个调用
            }
        });
        //传统方式（需要创建对象，可以用多次）
        f1(new Picture());
    }

    //静态方法，形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}

//接口
interface IL {
    void show();
}

//类 --实现IF =>>编程领域（硬编码）
class Picture implements IL{

    @Override
    public void show() {
        System.out.println("这是一幅名画...");//这里修改后，会影响所有picture对象实例
    }
}