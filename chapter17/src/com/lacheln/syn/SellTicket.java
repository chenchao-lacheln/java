package com.lacheln.syn;

/**
 * SellTicket
 * 使用多线程模拟 3个窗口同时售票 100张
 * @author lacheln
 * @date 2022/7/22 00:48
 * @since 1.0.0
 */
public class SellTicket {
    public static void main(String[] args) {
//        //测试
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        //会出现票数超卖现象
//        /*
//        窗口Thread-0 售出一张票 剩余票数1
//        窗口Thread-1 售出一张票 剩余票数0
//        售票结束...
//        窗口Thread-2 售出一张票 剩余票数-1
//        售票结束...
//        窗口Thread-0 售出一张票 剩余票数-2
//        售票结束...
//         */
//        sellTicket01.start();//启动售票线程
//        sellTicket02.start();//启动售票线程
//        sellTicket03.start();//启动售票线程



//        System.out.println("====使用实现接口的方式来售票====");
//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();//第1个窗口
//        new Thread(sellTicket02).start();//第2个窗口
//        new Thread(sellTicket02).start();//第3个窗口


        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();//第1个窗口
        new Thread(sellTicket03).start();//第2个窗口
        new Thread(sellTicket03).start();//第3个窗口



    }
}
//实现接口方式,使用synchronized 实现线程同步
class SellTicket03 implements Runnable {
    private int ticketNum = 100;//让多个线程共享  ticketNum
    private boolean loop = true;//控制run方法的变量
    Object object = new Object();

    //同步方法的锁（静态的），为当前类本身
    //public synchronized static void m1()的锁 是加在 SellTicket03.class
    //如果要在静态方法中，实现一个代码块
    /*
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
     */
    public synchronized static void m1(){

    }
    public static void m2(){
        //注意：同步方法的锁（静态的），为当前类本身，
        //  所以这里应该填 SellTicket03.class，，填this会报错
        synchronized (SellTicket03.class) { 
            System.out.println("m2");
        }
    }

    //1.public synchronized void sell() 是一个同步方法
    //2.这时锁 是在this对象，
    //3.也可以在代码块上写 synchronized ，同步代码块，互斥锁还是在this对象
    //4.同步方法的锁可以是this，也可以是其他对象（要求是同一个对象） object
    public /*synchronized*/ void sell() { //同步方法，在同一时刻，只能有一个线程来执行sell方法
        synchronized (/*this*/ object) { //同步代码块
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
            }

            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" +
                    " 剩余票数" + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();//同步方法
        }
    }
}


class SellTicket01 extends Thread{

    private static int ticketNum = 100;//让多个线程共享  ticketNum
    @Override
    public void run() {
        while (true){

            if (ticketNum <= 0){
                System.out.println("售票结束...");
                break;
            }

            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" +
                    " 剩余票数" + (--ticketNum));

        }
    }
}

//实现接口方式
class SellTicket02 implements Runnable{
    private int ticketNum = 100;//让多个线程共享  ticketNum
    @Override
    public void run() {
        while (true){

            if (ticketNum <= 0){
                System.out.println("售票结束...");
                break;
            }

            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" +
                    " 剩余票数" + (--ticketNum));

        }
    }
}