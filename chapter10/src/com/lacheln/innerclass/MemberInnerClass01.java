package com.lacheln.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.hi();

        //外部其他类，使用成员内部类的3中方式
        //第一种方式
        // outer08.new Inner08();相当于把new Inner08()当做是outer08的成员
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        //第二种方式：在外部类中，编写一个方法，可以返回Inner08对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();

    }
}

class Outer08 {//外部类
    private int n1 = 100;
    public String name = "刘备";
    
    
    public void ok(){
        System.out.println("ok()方法");
    }
    //注意:成员内部类是定义在外部类的成员位置上
    //可以添加任意访问修饰符（public protected 默认 private），因为他的地位就是一个成员
    public class Inner08 {//成员内部类
        private int n1 = 99;
        public void say(){
            //可以直接访问外部类的所有成员，包括私有的
            //如果成员内部类的成员和外部类的成员重名，会遵守就近原则
            //可以通过 外部类名.this.属性 来访问外部类成员
            System.out.println("Outer08 的 n1 = " + n1 + "Outer08 的 name = " + name
                    + " 外部类的n1 = " + Outer08.this.n1);
            ok();
        }
    }
    //方法：返回一个Innner08实例
    public Inner08 getInner08Instance(){
        return new Inner08();
    }

    //方法
    public void hi (){
        //使用成员内部类
        //创建成员内部类的对象，然后使用相关方法
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}