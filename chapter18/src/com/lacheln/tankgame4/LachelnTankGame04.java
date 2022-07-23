package com.lacheln.tankgame4;

import javax.swing.*;

/**
 * LachelnTankGame01
 *
 * @author lacheln
 * @date 2022/7/18 22:39
 * @since 1.0.0
 */
public class LachelnTankGame04 extends JFrame {
    //定义一个MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        LachelnTankGame04 lachelnTankGame01 = new LachelnTankGame04();

    }
    public LachelnTankGame04(){
        mp = new MyPanel();
        //将mp，放入到Thread 并 启动
        new Thread(mp).start();
        this.add(mp);//把面板（就是游戏的绘图区域）
        this.setSize(1000,750);//设置大小
        this.addKeyListener(mp); //让JFrame 监听 mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
        this.setVisible(true);//显示
    }
}
