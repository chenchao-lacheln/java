package com.lacheln.tankgame05;

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
    private int direct; //坦克方法 0 上 1 右 2 下 3 左
    private int speed = 1;
    boolean isLive = true;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //上右下左移动方法
    public void moveUp(){
        y -= speed;
    }
    public void moveRight(){
        x += speed;
    }
    public void moveDown(){
        y += speed;
    }
    public void moveLeft(){
        x -= speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

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