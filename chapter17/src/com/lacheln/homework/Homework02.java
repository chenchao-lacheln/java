package com.lacheln.homework;

/**
 * Homework02
 *
 * @author lacheln
 * @date 2022/7/23 18:56
 * @since 1.0.0
 */
public class Homework02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("t1");
        Thread thread2 = new Thread(t);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}
//编写取款的线程
//涉及多个线程共享资源，使用实现Runnable接口的方式
class T implements Runnable{
    private int money = 10000;
    @Override
    public void run() {
        while (true) {
            /*
            1.使用synchronized 实现线程同步
            2.当多个对象指定到这里时，就会去争夺this对象锁
            3.哪个对象争夺到（获取）this对象锁，就执行synchronized代码块，执行完后，会释放this对象锁
            4.争夺不到this对象锁，就blocked，准备继续争夺
            5.this对象锁是非公平锁
             */
            synchronized (this) {
                //判断余额是否足够
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + " 取出了1000块 当前余额 = " + money);
            }
            //休眠1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
