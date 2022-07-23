package com.lacheln.tankgame4;

import java.util.Vector;

/**
 * EnemyTank
 * 敌人坦克
 * @author lacheln
 * @date 2022/7/19 08:39
 * @since 1.0.0
 */
public class EnemyTank extends Tank {
    //在敌人坦克类，使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
