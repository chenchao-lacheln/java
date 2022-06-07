package com.lacheln.homework;

/**
 * Homework08
 *
 * @author lacheln
 * @date 2022/5/26 11:24
 * @since 1.0.0
 */
public class Homework08 {
    public static void main(String[] args) {
        //演示枚举值的switch使用
        Color red = Color.RED;
        red.show();

        //switch() 中，放入枚举对象
        //在每个case后，直接写上在枚举类中定义的枚举对象即可
        switch (red){
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            default:
                System.out.println("没有匹配到");
        }
    }
}
//接口
interface IMyInterface {
    public void show();
}
//Color枚举类
enum Color implements IMyInterface{
    RED(255,0,0),BULE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    BLUE(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为：" + redValue + "，" + greenValue + "，" + blueValue);
    }
}