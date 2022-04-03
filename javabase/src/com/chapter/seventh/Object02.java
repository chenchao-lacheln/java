package com.chapter.seventh;

public class Object02 {
    public static void main(String[] args) {

        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};

        MyTools array = new MyTools();
        array.printArray(map);
        array.printArray(map);
        array.printArray(map);

    }
}


//把输出的功能，写到一个类的方法中，然后调用该方法即可；
class MyTools{
//    接收一个二维数组
    public void printArray(int[][] map){
        System.out.println("=============");
        for (int i =0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }

}