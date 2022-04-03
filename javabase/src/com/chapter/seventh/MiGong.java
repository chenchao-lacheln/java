package com.chapter.seventh;

public class MiGong {
    public static void main(String[] args) {
        /*
        0表示正常空间，可以通行
        1表示障碍物，无法通行
         */
        int[][] map = new int[8][7];
//        将最上面和最下面的一行都设置为1
        for (int i = 0;i < 7;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
//        将最左面和最右面的一行都设置为1
        for (int i = 0;i < 8;i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
//        将其他无规律的障碍物也设置为1
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;//测试回溯

        System.out.println("====当前迷宫的情况====");
        for (int i = 0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        //使用findWay2找路
        T1 test2 = new T1();
        test2.findWay(map,1,1);
        System.out.println("\n找路的情况如下");

        for (int i = 0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
findWay 方法就是专门来找出迷宫的路径的
如果找到就返回true，否则就返回flase
map就是二维数组，就表示迷宫
i，j 就是老鼠的位置，初始化的位置为（1，1）
因为我们是递归的找路，所以 我们先规定map数组的各个值得含义
    0表示可以走，但是还没走过  1表示障碍物 2表示可以走通  3表述走过，但是走不通，是死路
当map[6][5] = 2 就说明找到通路，可以结束，否则继续
先确定老鼠找路策略，下--》右--》上--》左
 */
class T1 {
    public boolean findWay(int[][] map,int i ,int j ){
        if (map[6][5] == 2){ //说明已经找到
            return true;
        }else {
            if (map[i][j] == 0){ //当前这个位置为0 说明可以走

                //假如可以走通
                map[i][j] = 2;

                //使用找路的策略，来确定该位置是否真的可以走通
                //下--》右--》上--》左
                if (findWay(map, i + 1, j)){//向下走
                    return true;
                }else if (findWay(map, i, j + 1)){//向右走
                    return true;
                }else if (findWay(map, i - 1, j)){//向上走
                    return true;
                }else if (findWay(map, i, j - 1)){//向左走
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else { //map[i][j] = 1,2,3
                return false;
            }
        }
    }

//修改策略 下--》右--》上--》左  ===》》上--》右--》下--》左
    public boolean findWay2(int[][] map,int i ,int j ){
        if (map[6][5] == 2){ //说明已经找到
            return true;
        }else {
            if (map[i][j] == 0){ //当前这个位置为0 说明可以走

                //假如可以走通
                map[i][j] = 2;

                //使用找路的策略，来确定该位置是否真的可以走通
                //下--》右--》上--》左
                if (findWay2(map, i - 1, j)){//向上走
                    return true;
                }else if (findWay2(map, i, j + 1)){//向右走
                    return true;
                }else if (findWay2(map, i + 1, j)){//向下走
                    return true;
                }else if (findWay2(map, i, j - 1)){//向左走
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else { //map[i][j] = 1,2,3
                return false;
            }
        }
    }
}
