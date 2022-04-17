package com.super_;

public class B extends A{

    public int n1 = 888;

    //访问父类的属性 , 但不能访问父类的 private 属性 [案例]super.属性名
    public void hi(){
        System.out.println(super.n1 + " " + super.n2 + " "  + super.n3);//super.n4为private不能直接访问
    }
    //访问父类的方法，不能访问父类的 private 方法 super.方法名(参数列表);
    public void ok(){
        // super.test400() 不能直接访问
        super.test100();
        super.test200();
        super.test200();
    }
//    访问父类的构造器(这点前面用过)：super(参数列表);只能放在构造器的第一句，只能出现一句！
    public B(){
//        super();
//        super("jack",15);
          super("jac");
    }

    public void cal(){
        System.out.println("B类的cal方法。。");
    }
    public void sum(){
        System.out.println("B类的sum方法。。");
        /**
         * 希望调用父类-A的cal方法
         * 有3种方式
         *找cal方法时，cal()和this.cal()顺序如下
         */
        //1找cal方法时，顺序是先找本类，如果有，则调用，
        //2.如果没有，则找父类（如果有，且可以调用，则调用）
        //3.如果父类没有，则继续找父类的父类，整个规则，就是这样的，直到object类
        //.提示：如果查找方法的过程中，找到了，但是不能访问，比如private，则报错 cannot access
        //     如果查找方法的过程中，没有找到，则提示方法不存在
//        cal();
//        this.cal();//等价于cal();
        /**
         * 找cal方法时，super.cal()顺序如下
         */
        super.cal();//找cal的顺序是直接查找父类，也就是直接跳过了本类，也就是没有第1步，其他规则一样

        /**
         * 演示访问属性的规则
         */
        //n1和this.n1查找的规则如下
        //1找cal方法时，顺序是先找本类，如果有，则调用，
        //2.如果没有，则找父类（如果有，且可以调用，则调用）
        //3.如果父类没有，则继续找父类的父类，整个规则，就是这样的，直到object类
        //.提示：如果查找属性的过程中，找到了，但是不能访问，比如private，则报错 cannot access
        //     如果查找属性的过程中，没有找到，则提示属性不存在
        System.out.println(n1);
        System.out.println(this.n1);

        //找n1(super.n1)的顺序是直接查找父类属性，也就是直接跳过了本类属性，也就是没有第1步，其他规则一样
        System.out.println(super.n1);
    }
}
