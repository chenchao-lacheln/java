package com.modifier;

public class A  {
    //四个属性 分辨使用不同的访问修饰符来修饰
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1(){
        //该方法可以访问 四个属性，在同一类中，可以访问public 默认 protected private修饰的属性或者方法
        System.out.println("n1 = " + n1 + "\tn2 = " + n2 +"\tn3 = " + n3 + "\tn4 = " + n4);
    }
    //四种修饰符也可以修饰方法
    protected void  m2(){

    }

    void m3(){

    }

    private void m4(){

    }

    public void hi(){
        //该方法可以访问 四个属性，在同一类中，可以访问public 默认 protected private修饰的属性或者方法
        m1();
        m2();
        m3();
        m4();
    }
}
