package com.lacheln.interface_;

public class InterfacePloyArr {
    public static void main(String[] args) {

        //多态数组 -> 接口整数类型
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone01();
        usbs[1] = new Camera01();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定
            //和前面一样，需要进行类型的向下转型
            if (usbs[i] instanceof Phone01){//判断运行是Phone01就进行向下转型
                ((Phone01) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
};
class Phone01 implements Usb{
    public void call(){
        System.out.println("手机可以打电话...");
    }

    @Override
    public void work() {
        System.out.println("手机工作中...");
    }
};
class Camera01 implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中...");
    }
};
