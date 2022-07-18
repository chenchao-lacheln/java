package com.lacheln.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * MyPanel
 * 坦克大战绘图区域
 * @author lacheln
 * @date 2022/7/18 22:33
 * @since 1.0.0
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);//初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认是黑色
    }
}
