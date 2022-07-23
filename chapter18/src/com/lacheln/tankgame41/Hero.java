package com.lacheln.tankgame41;

import java.util.Vector;

/**
 * Hero
 * 自己的坦克
 * @author lacheln
 * @date 2022/7/18 22:32
 * @since 1.0.0
 */
public class Hero extends Tank {
    //定义一个shot对象,表示一个射击(线程)
    Shot shot = null;
    //可以发射多颗子弹
    Vector<Shot> shots = new Vector<>();

    public Hero(int x, int y) {
        super(x, y);
    }

    //射击
    public void shotEnemyTank(){

        //一次性最多发射5可子弹
        if (shots.size() == 5){
            return;
        }

        //创建Shot对象，需要根据当前Hero对象的位置和方向来创建
        switch (getDirect()){ //得到Hero对象的方法
            case 0: //上
                shot = new Shot(getX() + 20,getY(),0);
                break;
            case 1: //右
                shot = new Shot(getX() + 60,getY() + 20,1);
                break;
            case 2: //下
                shot = new Shot(getX() + 20,getY() + 60,2);
                break;
            case 3: //左
                shot = new Shot(getX(),getY() + 20,3);
                break;
        }

        //把新创建的shot放入到shots
        shots.add(shot);
        //启动Shot线程
        new Thread(shot).start();
    }
}
