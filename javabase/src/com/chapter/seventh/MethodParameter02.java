package com.chapter.seventh;

public class MethodParameter02 {
    public static void main(String[] args) {
        B b = new B();
        int[] array2 = {1,2,3};
        b.test100(array2);//调用方法
        System.out.println("main方法的array数组");
        //遍历数组
        for (int i = 0;i < array2.length;i++){
            System.out.print(array2[i] + "\t");
        }
        System.out.println();


        //测试
        People p = new People();
        p.name = "lacheln";
        p.age = 25;

        //b.test200(p)是属于main方法的，所以这个p是main方法中p对象，
        // 执行b.test200(p)的时候，相当于把main方法中p赋值给B对象中的P方法
        b.test200(p);
        //测试题：如果test200执行的是p=null，则下面的结果为 10；
        /*
        测试题：如果test200执行的是一下语句，下面的结果为:
        p = new People();
        p.name = "tom";
        p.age = 24;
         */
        System.out.println("main的p.age=" + p.age);
    }
}
class People{
    String name;
    int age;
}
class B{
    public void test200(People p){
//        p.age = 10000;//修改对象属性
        //思考
        //p = null;指的是把test200置空，置空的时候没办法影响到对象的属性
//        p = null;
        //思考
        p = new People();
        p.name = "tom";
        p.age = 24;
    }
    public void test100(int[] array1){
        array1[0] = 200;//修改元素
        System.out.println("test100的array数组");
        //遍历数组
        for (int i = 0;i < array1.length;i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
    }
}

/*
main的p.age=25
 */