package com.lacheln.exit_;

/**
 * ThreadExit_
 *
 * @author lacheln
 * @date 2022/7/22 01:07
 * @since 1.0.0
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        //如果希望main线程去控制t1 线程的终止，必须可以修改loop
        //让t1 退出run方法，从而终止 t1线程 -->> 通知方式

        System.out.println("main线程休眠10s...");
        Thread.sleep(10 * 1000);
        t.setLoop(false);
    }
}

class T extends Thread{

    private int count = 0;
    //设置一个变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中... " + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}