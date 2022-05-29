package com.lacheln.try_;

/**
 * TryCatchDetail01
 *
 * @author lacheln
 * @date 2022/5/29 13:48
 * @since 1.0.0
 */
public class TryCatchDetail01 {
    public static void main(String[] args) {

        /*
        1.如果try代码块 可能有多个异常
        2.可以使用多个catch 分别捕获不同的异常，进行处理
        3.要求子类异常写在前面，父类异常卸载后面
         */
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        }catch (NullPointerException n){
            System.out.println("空指针异常 = " + n.getMessage());
        } catch (ArithmeticException a){
            System.out.println("算术异常 = " + a.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {

        }


    }
}
class Person {
    private String name = "marry";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
