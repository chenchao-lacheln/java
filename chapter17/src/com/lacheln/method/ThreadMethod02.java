package com.lacheln.method;

/**
 * ThreadMethod02
 *
 * @author lacheln
 * @date 2022/7/23 00:25
 * @since 1.0.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0;i <= 20;i++){
            Thread.sleep(1000);
            System.out.println("主线程（小弟）吃了 " + i + " 个包子");
            if (i == 5){
                System.out.println("主线程（小弟） 让 子线程（老大）先吃");
                //join，线程插队
                //t2.join();// 相当于 让T2 线程先执行完毕

                Thread.yield();//礼让，不一定成功
                System.out.println("子线程（老大）吃完了，  主线程（小弟） 接着吃....");
            }
        }
    }
}

class T2 extends Thread{//定义线程类
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程(老大)吃了 " + i + " 个包子");
        }
    }
}

