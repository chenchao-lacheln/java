package com.lacheln.exception_;

/**
 * exception_
 *
 * @author lacheln
 * @date 2022/5/28 23:28
 * @since 1.0.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //分母不能为0，程序会抛出异常 ArithmeticException
        //当抛出异常后，程序就会退出，崩溃了，下面的代码就不会执行了
//        int res = num1 / num2;
        //如果程序员认为一段代码可能出现异常/问题，可以使用try-catch异常处理机制来解决，以此保证程序健壮性
        //选中代码块-->>快捷键：command + option + T   选中try-catch
        //如果进行了异常处理，即使出现了异常，程序也会继续执行
        //属于运行时异常
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            //抛出异常信息
//            e.printStackTrace();
            //输出异常信息
            System.out.println("出现异常的原因 = " + e.getMessage());
        }
        System.out.println("程序继续运行....");
    }
}
