package com.lacheln.customexception;

/**
 * CustomException01
 *
 * @author lacheln
 * @date 2022/5/29 15:12
 * @since 1.0.0
 */
public class CustomException01 {
    public static void main(String[] args) {
        int age = 180;

        if (!(age > 20 && age < 120)){
            //这里可以通过构造器设置信息
            throw new AgeException("年龄需要在 20~120 之间");
        }
        System.out.println("你的年龄范围正常");
    }
}
//自定义异常
/*
1.一般情况下 ,我们自定义异常是继承RuntimeException
2.即把自定义异常做成运行时异常，好处是，我们可以使用默认处理机制，比较方便
 */
class AgeException extends RuntimeException{
    public AgeException(String message) {//构造器
        super(message);
    }
}
