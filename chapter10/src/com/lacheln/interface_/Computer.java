package com.lacheln.interface_;

public class Computer {
    //编写一个方法,计算机工作
    public void work(Usbinterface usbinterface){
        //通过接口来调用方法
        usbinterface.statr();
        usbinterface.stop();
    }
}
