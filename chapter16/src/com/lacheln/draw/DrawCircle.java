package com.lacheln.draw;

import javax.swing.*;
import java.awt.*;

/**
 * DrawCircle
 * 画圆形
 * @author lacheln
 * @date 2022/7/18 08:55
 * @since 1.0.0
 */

//JFrame 对应一个窗口，可以理解为画框，画框里面是面板
public class DrawCircle extends JFrame{

    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
        //当 X 掉程序之后，程序JVM并没有正在的释放，仍然在运行
        System.out.println("退出程序");
    }

    //构造器
    public DrawCircle(){
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口
        this.add(mp);
        //设置窗口大小（画框大小）宽400，长300
        this.setSize(400,300);
        //当点击窗口的 X ，程序就完全退出;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

//先定义一个MyPanel类，继承JPanel类，画图形，就在画板上画
class MyPanel extends JPanel {
    /*
    说明
    1.MyPanel 对象就是一个画板
    2.Graphics g 把g理解成一支笔
    3.Graphics提供了很多绘图方法
     */
    @Override
    public void paint(Graphics g) { //绘图方法
        super.paint(g); //调用父类方法，完成初始化
        System.out.println("paint方法被调用了");
        //画一个圆
        g.drawOval(10,10,100,100);
    }
}