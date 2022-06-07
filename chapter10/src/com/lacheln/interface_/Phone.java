package com.lacheln.interface_;

//Phone 类 实现 Usbinterface
//1.即，Phone类需要实现 Usbinterface 接口 规定/声明的方法
public class Phone implements Usbinterface{
    @Override
    public void statr() {
        System.out.println("手机开始工作....");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作....");
    }
}
