package com.lacheln.tankgame4;

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
    public Hero(int x, int y) {
        super(x, y);
    }

    //射击
    public void shotEnemyTank(){
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
        //启动Shot线程
        new Thread(shot).start();
    }
}
