package com.lacheln.tankgame05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Recorder
 *
 * @author chaochen
 * @date 2023/10/18
 * @since 1.0.0
 * 该类用于记录相关信息的，和文件交互
 */
public class Recorder {
    //定义变量，记录我方击毁敌人坦克数
    private static int allEnemyTankNum = 0;
    //定义IO对象，准备写数据到文件中
    private static BufferedWriter bw = null;
    private static String recodeFile = "chapter20/src/myRecord.txt";

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    //增加一个方法，当游戏退出时，将allEnemyTankNum 保存到 recodeFile
    public static void keepRecord(){
        try {
            bw = new BufferedWriter(new FileWriter(recodeFile));
            bw.write(allEnemyTankNum + "\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //当我方坦克击毁一个敌人坦克，就应当 allEnemyTankNum++
    public static void addAllEnemyTankNum(){
        Recorder.allEnemyTankNum++;
    }
}
