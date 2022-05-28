package com.lacheln.homework;

/**
 * Homework07
 *
 * @author lacheln
 * @date 2022/5/26 10:59
 * @since 1.0.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        Car car1 = new Car(-90);
        car1.getAir().flow();
        Car car2 = new Car(37);
        car2.getAir().flow();
    }
}

class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    //空调类 Air 成员内部类
    class Air {
        //吹风功能
        public void flow() {
            if (temperature > 40) {
                System.out.println("温度大于40度，空调吹冷风....");
            }else if (temperature < 0){
                System.out.println("温度小于0度，空调吹暖风....");
            }else {
                System.out.println("温度正常，空调已关闭..");
            }
        }
    }
    //返回air对象
    public Air getAir(){
        return new Air();
    }
}