package com.chapter.seventh;

public class RecursionExercise02 {
    public static void main(String[] args) {
        Day1 test1 = new Day1();
        int n = 7;
        int res = test1.fiboracciNumber(n);
        if (n != -1) {
            System.out.println("当n = " + n +" 时，对应的菲波拉契数为 " + res);
        }
    }
}
class Day1 {
    public int fiboracciNumber(int n) {
        if ( n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fiboracciNumber(n - 1) + fiboracciNumber(n - 2);
            }
        }else {
            System.out.println("n的值需要 >= 1");
            return -1;
        }
    }
}
