package com.lacheln.draw;

import javax.swing.*;
import java.awt.*;

/**
 * DrawCircle
 * 画圆形
 * @author lacheln
 * @date 2022/7/18 08:55
 * @since 1.0.0
 */

//JFrame 对应一个窗口，可以理解为画框，画框里面是面板
public class DrawCircle extends JFrame{

    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
        //当 X 掉程序之后，程序JVM并没有正在的释放，仍然在运行
        System.out.println("退出程序");
    }

    //构造器
    public DrawCircle(){
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口
        this.add(mp);
        //设置窗口大小（画框大小）宽400，长300
        this.setSize(400,300);
        //当点击窗口的 X ，程序就完全退出;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

//先定义一个MyPanel类，继承JPanel类，画图形，就在画板上画
class MyPanel extends JPanel {
    /*
    说明
    1.MyPanel 对象就是一个画板
    2.Graphics g 把g理解成一支笔
    3.Graphics提供了很多绘图方法
     */
    @Override
    public void paint(Graphics g) { //绘图方法
        super.paint(g); //调用父类方法，完成初始化
        System.out.println("paint方法被调用了");
        //画一个圆
        //g.drawOval(10,10,100,100);
        //演示绘制不同图形
        //1.画直线drawLine(int x1,int y1,int x2,int y2)
        //g.drawLine(10,10,100,100);

        //2.画矩形边框drawRect(int X, int y, int width, int height)
        //g.drawRect(10,10,100,100);

        //3.画椭圆边框drawOval(int x, int y, int width, int height)

        //4.填充矩形fillRect(int x, int y, int width, int height)
        //设置画笔颜色
        //g.setColor(Color.blue);
        //g.fillRect(10,10,100,100);

        //5.填充椭圆fillval(int x, int y, int width, int height)
        //g.setColor(Color.red);
        //g.fillRect(10,10,50,100);

        //6.画图片drawlmage(Image img, int X, int y, .)
        //6.1获取图片资源 /IMG_0797.JPG 表示在该项目的根目录去获取 IMG_0797.JPG 图片资源
        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/IMG_0797.JPG"));
        //g.drawImage(image,10,10,177,142,this);

        //7.画字符串drawString(String str, int x, int y)
        //设置画笔颜色和字体
        g.setColor(Color.red);
        g.setFont(new Font("隶属",Font.BOLD,50));
        g.drawString("北京你好",100,100);// x,y对应左下角
        //8.设置画笔的字体setFont(Font font)
        //9.设置画笔的颜色setColor(Color c)
    }
}