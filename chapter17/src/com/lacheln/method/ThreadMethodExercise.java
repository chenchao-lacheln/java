package com.lacheln.method;

/**
 * ThreadMethodExercise
 *
 * @author lacheln
 * @date 2022/7/23 00:41
 * @since 1.0.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new T1());
        for (int i = 1; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
            if (i == 5){ //说明主线程输入5次
                t1.start();//启动子线程
                t1.join();//立即将t1线程，插入到main，让t1先执行
            }
            Thread.sleep(1000);//输出1次hi，让main线程休眠1s
        }
    }
}
class T1 implements Runnable{

    private int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }
        }
    }
}
