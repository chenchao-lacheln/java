package com.lacheln.houserent.service;

import com.lacheln.houserent.domain.House;

/**
 * //定义House[],保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作（增删改查）
 */
public class HouseService {
    private House[] houses;//创建数组，保存House对象
    private int houseNum = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值了

    //构造器
    public HouseService(int size){
        houses = new House[size];//当创建HouseService对象时，指定数组大小
        //便于测试，初始化House一个对象
        houses[0] = new House(0001,"刘备","188","海淀区",3000,"未出租");
    }

    //list方法，返回houses
    public House[] list(){
        return houses;
    }

    //add方法，添加新对象，返回boolean值
    public boolean add(House newHouse){
        //判断是否还可以继续添加（暂时不考虑吧数组扩容问题）
        if (houseNum == houses.length){
            System.out.println("数组已满，不能在添加了...");
            return false;
        }
        //把newHouse对象加入后，++再自增，新增加一个房屋
        houses[houseNum++] = newHouse;
        //需要设计一个id自增长的机制,然后更新newHouse的id
//        idCounter++;
//        newHouse.setId(idCounter);
        newHouse.setId(++idCounter);//和上面的注销代码等价
        return true;
    }
}
