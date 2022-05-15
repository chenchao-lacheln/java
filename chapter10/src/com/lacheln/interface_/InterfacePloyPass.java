package com.lacheln.interface_;

/**
 * 演示多态传递现象
 */
public class InterfacePloyPass {
    public static void main(String[] args) {
        //接口类型的变量，可以指向实现了该接口的类的对象实例
        IG ig = new Teacher();
        //如果IG 继承了 IH 接口，而Teacher 实现了 IG接口
        //那么，实际上就相当于 Teacher 也实现了 IH接口
        //这就是接口多态传递现象
        IH ih = new Teacher();
    }
}
interface IH{
    void hi();
}
interface IG extends IH{}
class Teacher implements IG{

    @Override
    public void hi() {

    }
}


