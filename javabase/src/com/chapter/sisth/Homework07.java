package com.chapter.sisth;

public class Homework07 {
    public static void main(String[] args) {
        int [] bubbleSort = {1,5,3,90,7};
        int temp = 0;
        for (int i = 0;i < bubbleSort.length - 1;i++){
            for (int j = 0;j < bubbleSort.length - 1 -i;j++){
                if (bubbleSort[j] > bubbleSort[j+1]){ //前面的数大就交换，从小到大排序；如果需要从大到小排序，则把大于符号改成小雨符号即可
                    temp = bubbleSort[j];
                    bubbleSort[j] = bubbleSort[j+1];
                    bubbleSort[j + 1] = temp;
                }
            }
        }
        for (int i =0;i < bubbleSort.length;i++){
            System.out.print(bubbleSort[i] + "\t");
        }
    }
}
