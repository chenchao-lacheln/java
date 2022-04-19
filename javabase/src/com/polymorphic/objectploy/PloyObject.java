package com.polymorphic.objectploy;

/**
 * Animal animal = new Anima();
 * 1.一个对象的编译类型和运行类型可以不一致
 *      1.1.Dog()是Animal的子类，可以把Dog()子类对象赋给一个父类Animal的对象animal引用，
 *      也就是说，我们可以用一个父类的一个引用animal指向子类的一个对象 Dog()
 *       animal是对象引用，并不是对象，后面new出来的Dog()才是真正的对象
 *      animal这个对象引用的编译类型是Animal，运行类型是Dog
 *      1.2.也可以一致Animal animal = new Anima();
 *  2.编译类型在定义对象时，就确定了，不能改变
 *  animal的编译类型是Animal 案例：人一生，自己的爸爸就是确定的，认了一个干爸，亲爸还是那个
 *  3.运行类型是可以改变的
 *      3.1.animal = new Cat(); 用这个父类的引用animal指向另外一个子类的对象Cat()
 *      3.2.animal的运行类型就变成了Cat，编译类型仍然是Animal
 *  4.编译类型看定义时 = 号的左边，运行类型看 = 号的右边
*       4.1比如，怎么知道animal的编译类型是哪一个呢？就看 = 号的左边 -> 也就是Animal
 *      4.2比如，怎么知道animal的运行类型是哪一个呢？就看 = 号的右边 -> 也就是Dog()，编程了Cat，就是Cat
 */
public class PloyObject {
    public static void main(String[] args) {
        //体验对象多态的特点

        //animal的编译类型就是Animal，运行类型就是Dog (编译就是javac的时候，真正运行程序的时候就是java)
        Animal animal = new Dog();
        //如何确定animal.cry();是调用的哪个方法？当执行cray的时候
        //当执行cray的时候，就看animal这话对象的运行类型是什么
        //下面的语句，animal的运行类型是Dog，所以cry就是Dog的cry
        animal.cry();//Dog cry()小狗汪汪叫。。。。

        //animal的编译类型仍然是Animal，运行类型就是Cat
        animal = new Cat();
        animal.cry();//Cat cry()小猫喵喵叫。。。。
    }
}
