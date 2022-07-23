package com.lacheln.tankgame4;

import java.util.Vector;

/**
 * EnemyTank
 * 敌人坦克
 * @author lacheln
 * @date 2022/7/19 08:39
 * @since 1.0.0
 */
public class EnemyTank extends Tank implements Runnable{
    //在敌人坦克类，使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true){
            //根据坦克的方向继续移动
            switch (getDirect()){
                case 0: //向上
                    //让坦克保持一个方向，走30步
                    for (int i = 0;i < 30;i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1: //向右
                    for (int i = 0;i < 30;i++) {
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2: //向下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3: //向左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }

            //然后 随机的改变坦克方向 0-3
            setDirect((int) (Math.random() * 4));
            //并发程序，一定要考虑清楚，该线程什么时候结束
            if (!isLive){
                break; //退出线程
            }
        }
    }
}
