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

        //画坦克-封装方法
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    //编写方法，画出坦克

    /**
     *
     * @param x 坦克的左上角 x 坐标
     * @param y 坦克的左上角 y 坐标
     * @param g 画笔
     * @param direct 坦克方法（上下左右）
     * @param type 坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direct, int type){
        //根据不同类型的坦克，设置不同颜色
        switch (type){
            case 0: //我们的坦克
                g.setColor(Color.CYAN);//青色
                break;
            case 1: //敌人的坦克
                g.setColor(Color.YELLOW);//黄色
                break;
        }
        //根据坦克方向，绘制坦克
        switch (direct){
            case 0: //表示向上
                g.fill3DRect(x,y,10,60,false); //画出坦克左边轮子
                g.fill3DRect(x + 30,y,10,60,false); //画出坦克右边轮子
                g.fill3DRect(x + 10,y + 10, 20 ,40,false);//画出坦克的盖子
                g.fillOval(x + 10, y + 20, 20, 20); //画出圆形的盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }
}
