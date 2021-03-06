package com.lacheln.tankgame;

/**
 * Tank
 *
 * @author lacheln
 * @date 2022/7/18 22:30
 * @since 1.0.0
 */
public class Tank {
    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
