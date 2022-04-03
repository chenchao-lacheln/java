package com.chapter.seventh;

public class MethodExercise02 {
    public static void main(String[] args) {
        int[][] map02 = {{1,2,3},{4,5,6},{7,8,9}};
        MyTools02 a = new MyTools02();
        a.array(map02);

    }
}

class MyTools02{
    public void array(int[][] map01){
        for (int i = 0;i < map01.length;i++){
            for (int j = 0;j < map01[i].length;j++){
                System.out.print(map01[i][j] + "\t");
            }
            System.out.println();
        }
    }
}