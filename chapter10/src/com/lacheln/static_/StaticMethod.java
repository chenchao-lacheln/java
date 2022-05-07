package com.lacheln.static_;

public class StaticMethod {
    public static void main(String[] args) {
        //创建2个学生对象，qiao敲
        Stu tom = new Stu("tom");
        //tom.payFee(50);
        Stu.payFee(50);

        Stu marry = new Stu("marry");
        //marry.payFee(50);
        Stu.payFee(50);

        Stu lacheln = new Stu("lacheln");
        //lacheln.payFee(300);
        Stu.payFee(300);

        //输出当前收到的总学费
        Stu.showFee();
    }
}
class Stu{
    private String name;//普通成员
    //定义一个静态变量，来累计学生的学费
    public static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFee(double fee){
        Stu.fee += fee;//fee累积到我们的静态变量
    }

    public static void showFee(){
        System.out.println("总学费有：" + Stu.fee);
    }
}
