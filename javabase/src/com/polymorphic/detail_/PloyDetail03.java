package com.polymorphic.detail_;

public class PloyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true
        //思考这里的bb是根据编译类型判断的呢 还是根据运行类型判断的呢

        //aa的编译类型是AA，运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof BB);//true
        System.out.println(aa instanceof AA);//true

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false obj不是AA的类型，也不是AA类型的子类型

        String str = "hello";
//        System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//true
    }
}

class AA{//父类

}
class BB extends AA{//子类

}