package com.lacheln.houserent.view;

import com.lacheln.houserent.domain.House;
import com.lacheln.houserent.service.HouseService;
import com.lacheln.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class Houseview {

    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(10);//设置数组的大小为10


    public void mainMenu(){
        do {
            System.out.println("==================房屋出租系统菜单==================");
            System.out.println("\t\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t\t6 退       出");
            System.out.print("请输入你的选择（1-6）：");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("刪除");
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    ListHouses();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        }while (loop);
    }

    //编写ListHouses()显示房屋列表
    public void ListHouses(){
        System.out.println("==================房屋列表==================");
        System.out.println(" //编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] list = houseService.list();//得到所有房屋信息
        for (int i = 0; i < list.length; i++) {//这里有个雷坑
            if (list[i] == null){//如果为空就不需要再显示
                break;
            }
            System.out.println(list[i]);
        }
        System.out.println("==================房屋列表显示完毕==================");
    }

    //编写addHouse()接收输入，创建House对象，调用add方法
    public void addHouse(){
        System.out.println("==================添加房屋==================");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态(未出租/已出租)：");
        String state = Utility.readString(3);
        //创建一个新的newHouse对象，注意ID是系统分配的，用户不能输入
        House newHouse = new House(0,name,phone,address,rent,state);
        if (houseService.add(newHouse)){
            System.out.println("======= ===========添加房屋成功==================");
        }else {
            System.out.println("==================添加房屋失败==================");
        }
    }
}
