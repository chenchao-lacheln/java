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
        houses[0] = new House(1,"刘备","188","海淀区",3000,"未出租");
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

    //del方法，删除一个房屋信息
    public boolean del(int delId){//接收一个要删除的id号
        //先找到要删除的房屋的信息对应的下标
        //注意：下标和房屋编号不是一回事
        int index = -1;
        //通过delId 和 已经存在的房屋信息的id进行比较，判断该房屋信息是否存在
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()){
                index = i;//使用index记录delId对应的房屋信息的下标i
            }
        }
        if (index == -1){//说明delId在数组中不存在（没有要删除的对应的房屋）
            return false;
        }
        //如果找到了要删除的房屋信息的id
        for (int i = index;i < houseNum - 1;i++){//注意houseNum - 1 否则会报空指针异常
            houses[i] = houses[i + 1];//将
        }
//        houses[houseNum - 1] = null;//等下雨下面的语句
//        houseNum--;//少一个

        //把当前存在的房屋信息的最后一个 设置null
        houses[--houseNum] = null;
        return true;
    }

    //findById方法，放回House对象或者null
    public House findById(int findId){

        //遍历数组
        for (int i = 0; i < houseNum; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
