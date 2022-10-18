package com.lacheln;

/**
 * Reader_
 * 模拟修饰器设计模式
 * @author chenchao
 * @date 2022/10/18 5:08 PM
 * @since 1.0.0
 */
public abstract class Reader_ { //抽象类
    public void readFile(){

    }
    public void readString(){

    }

    //在Reader_抽象类，使用Read方法统一管理
    //在后面调用时，利用动态绑定机制，绑定到对应的实现子类即可
    //public abstract void read();
}
