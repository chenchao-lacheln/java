package com.lacheln.tankgame06;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * LachelnTankGame01
 *
 * @author lacheln
 * @date 2022/7/18 22:39
 * @since 1.0.0
 */
public class LachelnTankGame6 extends JFrame {
    //定义一个MyPanel
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        LachelnTankGame6 lachelnTankGame06 = new LachelnTankGame6();

    }

    public LachelnTankGame6() {
        System.out.println("请输入选择 1：新游戏 2：继续上局游戏");
        String key = scanner.next();
        mp = new MyPanel(key);
        //将mp，放入到Thread 并 启动
        new Thread(mp).start();
        this.add(mp);//把面板（就是游戏的绘图区域）
        this.setSize(1300, 950);//设置外框大小
        this.addKeyListener(mp); //让JFrame 监听 mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
        this.setVisible(true);//显示

        //在JFrame 中增加相应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //System.out.println("监听到关闭窗口了");
                Recorder.keepRecord();
                System.exit(0); //正常退出
            }
        });
    }
}