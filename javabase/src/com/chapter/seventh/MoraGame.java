package com.chapter.seventh;


import java.util.Random;
import java.util.Scanner;

public class MoraGame {
    public static void main(String[] args) {
        //创建一个玩家对象
        Tom t = new Tom();
        //用来记录最后的输赢次数
        int isWinCount = 0;
        //创建一个二维数组，用来接收局数，Tom出拳情况以及电脑出拳情况
        int[][] arr1 = new int[3][3];
        int j = 0;
        //创建一个一维数组，用来接收输赢情况
        String[] arr2 = new String[3];

        Scanner myScanner = new Scanner(System.in);
        for (int i =0;i < 3;i++){ //比赛3次
            //获取玩家出的拳
            System.out.println("请输入你要出的拳（0-石头，1-剪刀，2-布）：");
            int num = myScanner.nextInt();
            t.setTomGuessNum(num);
            int tomGusee = t.getTomGuessNum();
            arr1[i][j + 1] = tomGusee;

            //获取电脑出的拳
            int comGusee = t.computerNum();
            arr1[i][j + 2] = comGusee;

            //将玩家猜的拳与电脑作比较
            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;

            //对每一局的情况进行输出
            System.out.println("=================");
            System.out.println("局数\t玩家的拳\t电脑的拳\t输赢情况");
            System.out.println(t.count + "\t" + tomGusee + "\t\t" + comGusee + "\t\t" + arr2);
            System.out.println("==================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);

            //对游戏的最终解决进行输出
            System.out.print("局数\t玩家的出拳\t电脑的出拳\t\t输赢情况");
            for (int a = 0;a < arr1.length;a++){
                for (int b = 0;b < arr1[a].length;b++){
                    System.out.print(arr1[a][b] + "\t\t\t");
                }
                System.out.print(arr2[a]);
                System.out.println();
            }
            System.out.println("你赢了" + isWinCount + "次");
        }
    }
}
/*
猜拳游戏
有个人Tom，设计他的成员变量 成员方法 ，可以电脑猜拳，电脑每次都会随机生成 0 1 2
0表示石头 1表示剪刀 2表示布
可以显示Tom的输赢次数（清单），假定玩3次
 */

//Tom类
class Tom{ //核心代码
    //玩家出拳的类型 0 1 2
    int tomGuessNum;
    //电脑出拳的类型 0 1 2
    int comGuseeNum;
    //玩家赢的次数
    int winCountNum;
    //比赛次数 一共比赛3次
    int count = 1;

    public void showInfo(){

    }
    /**
    电脑随机生成猜拳的数字方法
    @return
     */
    public int computerNum(){
        Random r = new Random();
        comGuseeNum = r.nextInt(3); // 方法返回0-2随机数
        return comGuseeNum;
    }

    /**
    设置玩家猜拳的数字方法
    @param tomGuessNum
     */
    public void setTomGuessNum(int tomGuessNum){
        if (tomGuessNum > 2 || tomGuessNum < 0){
            //抛出异常，李同学会写，没有处理
            throw new IllegalArgumentException("数字输入错误");
        }
        this.tomGuessNum = tomGuessNum;
    }

    public int getTomGuessNum(){
        return tomGuessNum;
    }

    /**
    比较猜拳的结果
    @return 玩家赢返回true，否则返回false
     */
    public String vsComputer(){
        if (tomGuessNum == 0 && comGuseeNum == 1){
            return "你赢了";
        }else if (tomGuessNum == 1 && comGuseeNum == 2){
            return "你赢了";
        }else if (tomGuessNum == 2 && comGuseeNum == 0){
            return "你赢了";
        }else if (tomGuessNum == comGuseeNum){
            return "平手";
        }else {
            return "你输了";
        }
    }

    /**
    记录玩家的次数
    @return
     */
    public int winCount(String s){
        count++; //控制玩的次数
        if (s.equals("你赢了")){
            winCountNum++;
        }
        return winCountNum;
    }
}

