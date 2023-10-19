package com.lacheln.tankgame06;

import java.io.*;
import java.util.Vector;

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
    private static BufferedReader br = null;
    private static String recodeFile = "chapter20/src/myRecord.txt";
    //定义Vector，指向Mypanel 对象的敌人坦克Vector
    private static Vector<EnemyTank> enemyTanks = null;
    //定义一个Node 的 Vector ，用于保存敌人信息node
    private static Vector<Node> nodes = new Vector<>();

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    //返回记录文件的路径
    public static String getRecodeFile() {
        return recodeFile;
    }

    //增加一个方法，用户读取RecordFile，恢复相关信息
    //该方法在继续上局游戏的时候，调用即可
    public static Vector<Node> getNodesAndEnemyTankRec(){
        try {
            br = new BufferedReader(new FileReader(recodeFile));
            allEnemyTankNum = Integer.parseInt(br.readLine()); //恢复 allEnemyTankNum 值，读取第一行
            //循环读取文件，生成nodes集合
            String line = "";
            while ((line = br.readLine()) != null){
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                nodes.add(node); //放入nodes Vector

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return nodes;
    }

    //增加一个方法，当游戏退出时，将allEnemyTankNum 保存到 recodeFile
    //对 keepRecord 进行升级，保存敌人坦克的坐标和方向
    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recodeFile));
            bw.write(allEnemyTankNum + "\r\n");
            //遍历敌人坦克的Vector，然后根据情况保存即可
            //OOP，定义一个属性，然后通过set方法得到 敌人坦克的Vector
            for (int i = 0; i < enemyTanks.size(); i++){
                //取出敌人坦克
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive){ //建议判断
                    //保存 enemyTank 信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    //写入到文件
                    bw.write(record + "\r\n");
                    //bw.newLine();// 换行，等价于 -->> "\r\n"
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
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
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
