package com.lacheln.homework;

import java.util.Scanner;

/**
 * homework01
 *
 * @author lacheln
 * @date 2022/7/23 14:29
 * @since 1.0.0
 */
public class homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);//注意
        a.start();
        b.start();
    }
}
//第一个线程 循环 随机打印100以内的整数
//创建A线程
class A extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a线程退出");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

//直到第2个线程从键盘 读取了Q命令
class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) { //构造器中 直接传入 A对象
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            //接收到用户的输入
            System.out.println("请输入你的指令（Q）表示退出");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q'){
                //已通知的方式结束a线程
                a.setLoop(false);
                System.out.println("b线程退出...");
                break;
            }
        }
    }
}
