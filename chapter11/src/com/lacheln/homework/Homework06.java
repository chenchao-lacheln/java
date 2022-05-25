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
        Person tang = new Person("唐僧", new Horse());
        tang.passRiver();
        tang.common();
        tang.common();
        tang.passRiver();

    }
}

//交通工具类接口IVehicles，有work方法
interface IVehicles {
    public void work();
}

//Horse类和Boat类 分别实现IVehicles
//Horse类
class Horse implements IVehicles{
    @Override
    public void work() {
        System.out.println("一般情况下，使用马儿前进...");
    }
}

//Boat类
class Boat implements IVehicles{
    @Override
    public void work() {
        System.out.println("过河的时候，使用小船");
    }
}

//创建交通工具类，有2个方法分别获得Horse和Boat
//设置static静态属性，直接使用
//VehicleFactore工厂类，不想创建工厂对象，只想直接使用VehicleFactore类下的getHorse和getBoat方法,因此static比较方便
class VehicleFactore {
    public static Horse getHorse(){
        return new Horse();
    }

    public static Boat getBoat(){
        return new Boat();
    }
}

//Person类，有name和Vehicles属性，在构造器中为2个属性赋值
class Person {

    //私有化name和Vehicles属性
    private String name;
    private IVehicles iVehicles;

    //构造器
    //创建人对象时，事先会给分配一个交通工具
    public Person(String name, IVehicles iVehicles) {
        this.name = name;
        this.iVehicles = iVehicles;
    }

    //实例化Person对象"唐僧"，要求一般情况下用Horse作为交通工具，遇到大河时使用Boat作为交通
    //编程思想：把具体的要求，封装成方法
    //过河
    //问题：如何不浪费，在构建对象时，传入的交通工具？
    //问题：如何防止始终使用的是Horse对象
        /*
        1.passRiver方法和common方法，使用iVehicles == null，都会使用new Horse()对象
        2.new Horse()初始化对象，会被passRiver和common方法同时进行判断，调用house的方法
         */
    public void passRiver(){
        //if (iVehicles == null) {
        /*
        iVehicles instanceof Boat 判断当前的对象是不是Boat
        (1)iVehicles = null :  iVehicles instanceof Boat => false
        (2)iVehicles = 马对象 :  iVehicles instanceof Boat => false
        (3)iVehicles = 船对象 :  iVehicles instanceof Boat => true
         */
        if (!(iVehicles instanceof Boat)) {
            //先得到船
            iVehicles = VehicleFactore.getBoat();
        }
        iVehicles.work();
    }
    //一般情况下
    public void common(){
        //先判断一下当前 iVehicles 属性是null，就获取一匹马
        //Horse horse = VehicleFactore.getHorse();
        //horse.work();
//        if (iVehicles == null) {
        if (!(iVehicles instanceof Horse)) {
            //使用多态
            iVehicles = VehicleFactore.getHorse();
        }
        //体现用接口调用
        iVehicles.work();
    }

}