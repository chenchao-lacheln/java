package com.lacheln.method;

/**
 * ThreadMethod03
 * 守护线程
 * @author lacheln
 * @date 2022/7/23 00:59
 * @since 1.0.0
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //如果希望当main线程结束后，子线程自动结束，只需将子线程设置为守护线程即可
        myDaemonThread.setDaemon(true); //设置为守护线程
        myDaemonThread.start();
        for (int i = 1; i <= 10; i++) { //main线程
            System.out.println("main线程在辛苦工作。。。。");
            Thread.sleep(500);
        }
    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (; ; ){ //无线循环
            try {
                Thread.sleep(500); //休眠50ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("聊天中~~~~");
        }
    }
}
