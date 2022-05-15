package com.lacheln.interface_;

public class Interface01 {
    public static void main(String[] args) {
        //创建手机，相机
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//把手机接入计算机
        System.out.println("=================");
        computer.work(camera);//把相机接入计算机
    }
}
