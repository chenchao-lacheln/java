package com.lacheln.syn;

/**
 * DeadLock_
 * 模拟线程死锁
 * @author lacheln
 * @date 2022/7/23 13:49
 * @since 1.0.0
 */
public class DeadLock_ {
    public static void main(String[] args) {

        //模拟死锁
        DeadLockDemo A = new DeadLockDemo(true);
        A.setName("A线程");
        DeadLockDemo B = new DeadLockDemo(false);
        B.setName("B线程");
        A.start();
        B.start();
    }
}

//线程
class DeadLockDemo extends Thread {
    static Object o1 = new Object(); //保证多线程共享一个对象 ，使用static
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag){ //构造器
        this.flag = flag;
    }

    //业务逻辑分析
    /*
    1.如果flag 为 T，线程 A就会先得到/持有 o1 对象锁，然后尝试去获取 o2对象锁
    2.如果线程A 得不到o2对象锁，就会 Blocked
    3.如果flag 为 F，线程 B就会先得到/持有 o2 对象锁，然后尝试去获取 o1对象锁
    4.如果线程A 得不到o1对象锁，就会 Blocked
     */
    @Override
    public void run(){
        if (flag){
            synchronized (o1){ //对象互斥锁
                System.out.println(Thread.currentThread().getName() + " 进入1");
                synchronized (o2){ //
                    System.out.println(Thread.currentThread().getName() + " 进入2");
                }
            }
        }else {
            synchronized (o2){ //对象互斥锁
                System.out.println(Thread.currentThread().getName() + " 进入3");
                synchronized (o1){ //
                    System.out.println(Thread.currentThread().getName() + " 进入4");
                }
            }
        }
    }

}
