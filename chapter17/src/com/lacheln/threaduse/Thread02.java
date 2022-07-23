package com.lacheln.threaduse;

/**
 * Thread02
 * 实现Runnable接口 开发线程
 * @author lacheln
 * @date 2022/7/21 00:16
 * @since 1.0.0
 */
public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        //dog.start;//这里不能调用start
//        //创建Thread对象，把dog对象（实现了Runnable），放入Thread
//        Thread thread = new Thread(dog);
//        //为什么 thread 能够调用start方法呢
//        thread.start();

        Tiger tiger = new Tiger();//实现了Runnable接口
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}
class Animal{}
class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫....");
    }
}

//线程代理类，模拟一个极简Thread类
class ThreadProxy implements Runnable{ //可以把 Proxy 当做 Thread

    private Runnable target = null; //属性 类型是 Runnable

    @Override
    public void run() {
        if (target != null){
            target.run();//动态绑定（运行类型 是Tiger）
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();//这个方式是真正实现多线程的方法
    }

    public void start0(){
        run();
    }
}


class Dog implements Runnable{ //通过实现Runnable接口 开发线程

    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("小狗汪汪叫...hi" + (++count) + Thread.currentThread().getName());
            //休眠1秒
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
