package com.lacheln.state_;

/**
 * ThreadState_
 *
 * @author lacheln
 * @date 2022/7/23 01:21
 * @since 1.0.0
 */
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName() + " 状态 " + t.getState());
        t.start();

        while (Thread.State.TERMINATED != t.getState()){//只要线程不终止，就一直查看线程的状态
            System.out.println(t.getName() + " 状态 " + t.getState());
            Thread.sleep(500);//让main线程休眠 500ms
        }

        System.out.println(t.getName() + " 状态 " + t.getState());
    }
}

class T extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 10; i++) {
                System.out.println("hi " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}
