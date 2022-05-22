package com.lacheln.annotation;

/**
 * Override_
 *
 * @author lacheln
 * @date 2022/5/22 12:17
 * @since 1.0.0
 */
public class Override_ {
    public static void main(String[] args) {

    }
}
class Father {
    public void fly(){
        System.out.println("Father fly..");
    }
}

class Son extends Father{
    /*
    1.@Override 注解放在fly方法上，表示子类的fly方法重写了父类的fly方法
    2.这里如果没有写@Override 还是重写了fly方法
    3.如果写了@Override方法，编译器就会去检查该方法是否真的重写了父类的方法，
        如果的确重写了，则编译通过，如果没有构成重写，则编译错误
    4.@Override 的定义
    如果发现了 @interface 则表示一个注解类

     @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }
     */
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }
}