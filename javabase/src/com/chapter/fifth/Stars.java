package com.chapter.fifth;

public class Stars {
    public static void main(String[] args) {
        int totalLevel = 30;
        for (int i = 1;i <= totalLevel; i++) { //表示层数

            for (int k = 1; k <= totalLevel -i;k++){
                System.out.print(" ");
            }

            for (int j = 1;j <= 2 * i - 1;j++) {
                if (j == 1 || j == 2 * i -1 || i == totalLevel) {
                    System.out.print("*");//print 没有ln表示不换行，println 有ln表示会换行
                }else {
                    System.out.print(" ");
                }
            }
            //每打完一层就需要换行
            System.out.println(); //表示换行  println本身就会换行
        }
    }
}
