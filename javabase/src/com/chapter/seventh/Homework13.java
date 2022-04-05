package com.chapter.seventh;

public class Homework13 {
    public static void main(String[] args) {
        Circle01 c = new Circle01();
        PassObject po = new PassObject();
        po.printAreas(c,5);
    }
}

class Circle01{
    double radius;
    //圆的面积
    public double findArea() {//返回面积
        return Math.PI * radius * radius;
    }

    //添加方法setRadius，修改当前对象的半径值
    public void setRadius(double radius){
        this.radius = radius;
    }
}

class PassObject{
    public void printAreas( Circle01 c,int times){
        //输出1~times之间的每个整数半径值
        for (int i = 1;i < times;i++){
            //修改c对象的半径值
            c.setRadius(i);
            System.out.println((double)i + "\t" + c.findArea());
        }
    }
}