package com.lacheln.threaduse;

/**
 * Thread01
 * 通过Thread类 创建线程
 * @author lacheln
 * @date 2022/7/20 23:19
 * @since 1.0.0
 */
public class Thread01 {
    public static void main(String[] args) {

        //创建Cat对象，可以当做线程使用
       Cat cat = new Cat();
        cat.start();
    }
}

//1.当一个类继承了 Thread 类，该类就可以当做线程使用
//2.我们会重写run方法，写上自己的业务代码
//3.run Thread类 实现了 Runnable接口的 run方法
/*
        @Override
        public void run() {
            if (target != null) {
                target.run();
            }
        }
 */
class Cat extends Thread {

    int times = 0;
    @Override
    public void run() { //重写run方法，写上自己的业务逻辑
        while (true) {
            //该线程，每隔一秒，在控制台输出"喵喵，我是小猫咪"
            System.out.println("喵喵，我是小猫咪" + (++times));
            //让该线程休眠一秒 // 快捷键command + option + T
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8){
                break; // 当times 到8，就退出while循环，此时线程也退出
            }
        }
    }
}
