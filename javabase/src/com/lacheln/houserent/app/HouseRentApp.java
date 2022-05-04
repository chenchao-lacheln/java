package com.lacheln.houserent.app;

import com.lacheln.houserent.view.Houseview;

public class HouseRentApp {
    public static void main(String[] args) {
        //穿件HouseView对象，并且显示主菜单，是整个程序的入口
        new Houseview().mainMenu();
        System.out.println("=======你退出房屋出租系统=======");

    }
}
