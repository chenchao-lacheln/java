package com.chapter.seventh;

public class Recursion01 {
    public static void main(String[] args) {
        T b = new T();
        b.test(4);
        int res = b.factorial(5);
        System.out.println("res = " + res);
    }
}

class T{
    public void test(int n){
        if (n > 2){
            test(n - 1);
        }
        System.out.println("n = " + n);
    }

    public int factorial(int a){
        if (a == 1){
            return 1;
        }else {
            return factorial(a - 1) * a;
        }
    }
}
