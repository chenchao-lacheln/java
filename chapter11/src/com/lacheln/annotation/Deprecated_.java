package com.lacheln.annotation;

/**
 * Deprecated_
 *
 * @author lacheln
 * @date 2022/5/22 12:37
 * @since 1.0.0
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

/*
1.@Deprecated修饰某个元素，表示该元素已经过时
2.即 不再推荐使用，但仍然可以是试用
3.查看 @Deprecated 注解类的源码
4.可以修饰方法，类，字段，包，参数 等等
5.可以做版本升级 过渡使用
案例：之前使用的类是jdk8里面的类，现在使用jdk11的类，就可以标注下之前使用的jdk8的类已经过时了@Deprecated
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}


 */
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi(){

    }
}
