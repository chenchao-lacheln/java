package com.chapter.seventh;

public class RecursionExercise03 {
    public static void main(String[] args) {
        DD test2 = new DD();
        int day = 1;
        int peachNums = test2.monkeyEatPeaches(day);
        if (peachNums != -1){
            System.out.println("第" + day +"天有" + peachNums + "个桃子");
        }
    }
}

class DD{
    /*
    猴子吃桃：猴子每天吃掉桃子的一半，再多吃一个，吃了10天后，还剩一个桃子了，猴子原来有多少个桃子
    分析
     */
    public int monkeyEatPeaches(int day){
        if (day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return (monkeyEatPeaches(day + 1) + 1) * 2;
        }else {
            System.out.println("day在1-10之间");
            return -1;
        }
    }
}