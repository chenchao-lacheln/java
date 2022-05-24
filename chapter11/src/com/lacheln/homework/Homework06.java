package com.lacheln.homework;

/**
 * Homework06
 *
 * @author lacheln
 * @date 2022/5/25 00:02
 * @since 1.0.0
 */
public class Homework06 {
    public static void main(String[] args) {

    }
}

//交通工具类接口
interface IVehicles {
    public void work();
}

class Horse implements IVehicles{
    @Override
    public void work() {
        System.out.println("一般情况下，使用马儿前进...");
    }
}

class Boat implements IVehicles{
    @Override
    public void work() {
        System.out.println("过河的时候，使用小船");
    }
}

//创建交通工具类，有2个方法分别获得Horse和Boat
class VehicleFactore {
    public static Horse getHorse(){
        return new Horse();
    }

    public static Boat getBoat(){
        return new Boat();
    }
}

//Person类，有name和Vehicles属性，在构造器中为2个属性复制
class Person {

    private String name;
    private IVehicles iVehicles;

    public Person(String name, IVehicles iVehicles) {
        this.name = name;
        this.iVehicles = iVehicles;
    }

}