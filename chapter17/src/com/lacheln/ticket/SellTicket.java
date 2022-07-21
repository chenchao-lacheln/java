package com.lacheln.ticket;

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
//
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

        System.out.println("====使用实现接口的方式来售票====");
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();//第1个窗口
        new Thread(sellTicket02).start();//第2个窗口
        new Thread(sellTicket02).start();//第3个窗口
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