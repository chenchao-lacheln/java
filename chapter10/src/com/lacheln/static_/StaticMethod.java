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

        //静态方法的使用场景
        // 如果我们不希望创建实例，也可以调用某个方法（即当做工具来使用）
        //此时，把方法做成静态方法比较合适,举例如下  Math.sqrt(9)不用实例化，直接进行调用
        System.out.println("9开平发的结果是：" + Math.sqrt(9));
        //调用MyTools工具类方法
        System.out.println(MyTools.sum(10,30));

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

//开发自己的工具时，可以将方法做成静态的，方便调用
class MyTools{
    public static double sum(double n1,double n2){
        return n1 + n2;
    }
}
