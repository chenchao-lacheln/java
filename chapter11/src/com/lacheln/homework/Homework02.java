package com.lacheln.homework;

/**
 * Homework02
 *
 * @author lacheln
 * @date 2022/5/23 01:37
 * @since 1.0.0
 */
public class Homework02 {
    public static void main(String[] args) {
    }
}
class Frock {
    //衣服出厂序列号起始值
    private static int currentNum = 100000;
    private  int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        //在Frock类的构造器中，通过调用getNextNum方法为Frock对象获取唯一序列号，复制给serialNumber属性。
        serialNumber = getNextNum();
    }

    //生成上衣唯一序列号方法
    public static int getNextNum(){
        currentNum += 100;//将getNextNum增加100
        return currentNum;
    }
}

class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());//100100
        System.out.println(Frock.getNextNum());//100200
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());//100300
        System.out.println(frock1.getSerialNumber());//100400
        System.out.println(frock2.getSerialNumber());//100500
    }
}
