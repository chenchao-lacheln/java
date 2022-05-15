package com.lacheln.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.TAX_RATE = 0.09;//可以进行修改

    }
}
//1.要求A类不能被其他类继承，可以用final修饰
final class A { }
//class B extends A{ }

class C {
    //2.要求hi方法不能被子类重写，可以使用final来修饰hi这个方法
    public final void hi(){

    }
}
class D extends C{

    //重写hi方法
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi方法");
//    }
}

//3.当不希望类的某个属性的值被修改，可以使用final修饰
class E {
    public final double TAX_RATE = 0.08;
}

//4.当不希望类的某个局部变量被修改，可以使用final修饰
class F {
    public void cry(){
        //NUM也被称为，局部常量
        final double NUM = 0.01;//局部变量
//        NUM = 0.9;
        System.out.println("NUM = " + NUM);
    }
}