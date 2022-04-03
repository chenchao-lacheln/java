package com.chapter.seventh;

public class EightQueens {
    public static void main(String[] args) {
        int[][] array = new int[8][8];

        System.out.println("====八皇后棋谱====");
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*

 */
class Queens {
    public boolean move(int[][] map, int a ,int b){
        return true;
    }
}
