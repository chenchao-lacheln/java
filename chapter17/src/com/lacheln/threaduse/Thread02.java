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
        Dog dog = new Dog();
        //dog.start;//这里不能调用start
        //创建Thread对象，把dog对象（实现了Runnable），放入Thread
        Thread thread = new Thread(dog);
        //为什么 thread 能够调用start方法呢
        thread.start();
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
