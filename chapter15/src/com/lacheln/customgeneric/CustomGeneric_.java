package com.lacheln.customgeneric;

/**
 * CustomGeneric_
 *
 * @author lacheln
 * @date 2022/7/17 17:53
 * @since 1.0.0
 */
public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}
//1.Tiger 后面泛型， 我们把 Tiger 就称之为 自定义泛型
//2.T, R, M 泛型的标识符，一般是单个大写字母
//3.泛型标识符，可以有多个
//4.普通成员可以使用泛型（属性、方法）
//5.使用泛型的数组，不能初始化
//6.静态方法不能使用泛型
class Tiger <T, R, M>{
    String name;
    R r;//属性使用到泛型
    M m;
    T t;

    //泛型数组不能初始化，会报错：Type parameter 'T' cannot be instantiated directly
    //因为数组在new的时候，不能确定 T 的类型，就无法在内存开辟空间
    //T[] ts = new T[8];
    //可以定义
    T[] ts;

    public Tiger(String name, R r, M m, T t) { //构造器使用泛型
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    //静态方法不能使用泛型
    //报错：'com.lacheln.customgeneric.Tiger.this' cannot be referenced from a static context
    //因为 静态是和类相关的，在类加载时，对象还没有创建
    //所以，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化
//    static R r2;
//    public static void m1 (M m) {
//
//    }

    //方法使用泛型
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() { //返回类型使用泛型
        return r;
    }

    public void setR(R r) { //方法使用泛型
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
