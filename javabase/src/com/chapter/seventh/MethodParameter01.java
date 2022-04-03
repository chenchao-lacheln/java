package com.chapter.seventh;

public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        BB z = new BB();
        z.swap(a , b);
        System.out.println("\na = " + a + "\nb = " + b);
    }
}

class BB{

    public void swap(int a , int b){
        System.out.println("\na和b交换前的值为" + "\na="+ a + "\nb="+ b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\na和b交换后的值为" + "\na="+ a + "\nb="+ b);
    }
}

/*
    a和b交换前的值为
            a=10
b=20

        a和b交换后的值为
        a=20
        b=10

        a = 10
        b = 20

 */