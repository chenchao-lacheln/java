package com.lacheln.interface_;

public class Computer {
    //编写一个方法,计算机工作
    /*
    1.Usbinterface usbinterface 形参是接口类型 Usbinterface
    2.看到 接收 实现了 Usbinterface 接口的类的对象实例
     */
    public void work(Usbinterface usbinterface){
        //通过接口来调用方法
        usbinterface.statr();
        usbinterface.stop();
    }
}
