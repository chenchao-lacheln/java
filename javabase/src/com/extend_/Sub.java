package com.extend_;

public class Sub extends Base{//子类

    public Sub() {//构造器
        System.out.println("Sub()-----");
    }

    public void sayOk(){//子类方法
        //非私有的private属性和方法 可以在子类进行访问
        //但是私有的属性和方法不能在子类中直接访问
        System.out.println(n1 + n2 + n3); //n4无法进行访问输出，n4是private属性
        test100();
        test200();
        test300();
//        test400(); test400是私有方法，无法访问

        //通过父类提供的公共方法去访问
        System.out.println("n4 = " + getN4());
        callTest400();
    }
}
