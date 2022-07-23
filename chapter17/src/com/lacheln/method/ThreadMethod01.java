package com.lacheln.method;

/**
 * ThreadMethod01
 *
 * @author lacheln
 * @date 2022/7/22 01:24
 * @since 1.0.0
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("lacheln");//设置线程名称
        t.setPriority(Thread.MIN_PRIORITY);//设置优先级
        t.start();//启动 子线程

        //主线程打印 5 个hi，就中断子线程休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Hi " + i);
        }
        System.out.println(t.getName() + "线程的优先级 = " + t.getPriority()); //1
        t.interrupt();//当执行到这里的时候，就会中断T线程的休眠

    }
}

class T extends Thread{//定义线程类
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子..." + i);
            }

            try {
                System.out.println(Thread.currentThread().getName() + "休眠中...");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //当该线程执行到 一个 interrupt方法时，就会catch一个异常，可以加入自己的业务代码
                //InterruptedException 是捕获到一个中断异常
                System.out.println(Thread.currentThread().getName() + "被 interrupt 了");
            }
        }
    }
}
