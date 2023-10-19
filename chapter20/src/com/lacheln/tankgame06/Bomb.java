package com.lacheln.tankgame06;

/**
 * Bomb
 * 炸弹
 * @author lacheln
 * @date 2022/7/23 22:12
 * @since 1.0.0
 */
public class Bomb {
    int x,y; //炸弹的坐标
    int life = 9; //炸弹的生命周期
    boolean isLive = true; //是否还存活

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命值
    public void lifeDown(){ //配合出现图片的爆炸效果
        if (life > 0){
            life--;
        }else {
            isLive = false;
        }
    }
}