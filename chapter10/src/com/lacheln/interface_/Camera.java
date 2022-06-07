package com.lacheln.interface_;

public class Camera implements Usbinterface{//实现接口,就是把接口的方法实现
    @Override
    public void statr() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机结束功罪...");
    }
}
