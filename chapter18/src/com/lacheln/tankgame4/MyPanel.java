package com.lacheln.tankgame4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * MyPanel
 * 坦克大战绘图区域
 * @author lacheln
 * @date 2022/7/18 22:33
 * @since 1.0.0
 */
//为了监听键盘时间，实现接口KeyListener
//为了让MyPanel 不停的重绘子弹，需要将 MyPanel 实现Runnable ，当做一个线程使用
public class MyPanel extends JPanel implements KeyListener,Runnable {
    //定义我的坦克
    Hero hero = null;
    //定义敌人的坦克，放入到Vector中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel(){
        hero = new Hero(100,100);//初始化自己的坦克
        //hero.setSpeed(5);//设置坦克的移动速度
        //初始化敌人坦克
        for (int i = 0;i < enemyTankSize;i++){
            //创建一个敌人坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            //设置方法
            enemyTank.setDirect(2);
            //给该enemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 60,enemyTank.getDirect());
            //加入到 enemyTank 的Vector 成员
            enemyTank.shots.add(shot);
            //启动shot对象
            new Thread(shot).start();
            //加入
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认是黑色

        //画坦克-封装方法
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);

        //画出Hero射击的子弹
        if (hero.shot != null && hero.shot.isLive == true){
            //注意：这里只绘制了一次，子弹需要不停的重绘
            System.out.println("子弹被绘制...");
            //g.fill3DRect(hero.shot.x,hero.shot.y,1,1,false);
            g.draw3DRect(hero.shot.x,hero.shot.y,1,1,false);
        }

        //画出敌人坦克.遍历Vector
        for (int i = 0;i < enemyTanks.size();i++){
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
            //画出  enemyTank 的所有子弹
            for (int j = 0;j < enemyTank.shots.size();j++){
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //绘制所有子弹，需要判断子弹是否还存活
                if (shot.isLive){ //isLive == true
                    g.draw3DRect(shot.x, shot.y, 1,1,false);
                }else {
                    //从Vector 移除
                    enemyTank.shots.remove(shot);
                }
            }
        }
    }

    //编写方法，画出坦克

    /**
     *
     * @param x 坦克的左上角 x 坐标
     * @param y 坦克的左上角 y 坐标
     * @param g 画笔
     * @param direct 坦克方法（上下左右）
     * @param type 坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direct, int type){
        //根据不同类型的坦克，设置不同颜色
        switch (type){
            case 0: //敌人的坦克
                g.setColor(Color.CYAN);//青色
                break;
            case 1: //我们的坦克
                g.setColor(Color.YELLOW);//黄色
                break;
        }
        //根据坦克方向，来绘制对应形状坦克
        //direct表示方向（0 向上 1 向右 2 向下 3 向左）
        //
        switch (direct){
            case 0: //表示向上
                g.fill3DRect(x,y,10,60,false); //画出坦克左边轮子
                g.fill3DRect(x + 30,y,10,60,false); //画出坦克右边轮子
                g.fill3DRect(x + 10,y + 10, 20 ,40,false);//画出坦克的盖子
                g.fillOval(x + 10, y + 20, 20, 20); //画出圆形的盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;
            case 1: //表示向右
                g.fill3DRect(x,y,60,10,false); //画出坦克上边轮子
                g.fill3DRect(x,y + 30,60,10,false); //画出坦克下边轮子
                g.fill3DRect(x + 10,y + 10, 40 ,20,false);//画出坦克的盖子
                g.fillOval(x + 20, y + 10, 20, 20); //画出圆形的盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 2: //表示向下
                g.fill3DRect(x,y,10,60,false); //画出坦克左边轮子
                g.fill3DRect(x + 30,y,10,60,false); //画出坦克右边轮子
                g.fill3DRect(x + 10,y + 10, 20 ,40,false);//画出坦克的盖子
                g.fillOval(x + 10, y + 20, 20, 20); //画出圆形的盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 3: //表示向右
                g.fill3DRect(x,y,60,10,false); //画出坦克上边轮子
                g.fill3DRect(x,y + 30,60,10,false); //画出坦克下边轮子
                g.fill3DRect(x + 10,y + 10, 40 ,20,false);//画出坦克的盖子
                g.fillOval(x + 20, y + 10, 20, 20); //画出圆形的盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){ //按下 W键
            hero.setDirect(0);
            //修改坦克的坐标 y -= 1
            hero.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_D){ //按下 D键
            hero.setDirect(1);
            hero.moveRight();
        }else if (e.getKeyCode() == KeyEvent.VK_S){ //按下 S键
            hero.setDirect(2);
            hero.moveDown();
        }else if (e.getKeyCode() == KeyEvent.VK_A){ //按下 A键
            hero.setDirect(3);
            hero.moveLeft();
        }

        //如果用户按下的是J，就发射
        if (e.getKeyCode() == KeyEvent.VK_J){
            System.out.println("用户按下了J，开始射击..");
            hero.shotEnemyTank();
        }
        //重绘面板
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { //每隔100ms，重绘区域,刷新绘图区域，子弹就移动
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }
}
