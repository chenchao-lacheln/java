package com.lacheln.generic;

/**
 * Generic03
 *
 * @author lacheln
 * @date 2022/7/17 12:56
 * @since 1.0.0
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("lacheln");
        /* 即：如下
            class Person<E>{
                String s;
                public Person(String s) {
                    this.s = s;
                }

                //某个方法的返回值的类型
                public  String f(){
                    return s;
                }
            }
         */
        stringPerson.show();//String
    }
}
/**
 * 泛型的作用是:可以在类声明时通过一个标识表示类中某个属性的类型，或者是某个方
 * 法的返回值的类型，或者是参数类型。
 */

class Person<E>{
    //通过一个标识表示类中某个属性的类型 ，即：E表示s的数据类型，
    // 该数据类型是在定义Person对象时指定，即在编译期间，确定E是什么类型
    E s;

    //E也可以是参数类型
    public Person(E s) {
        this.s = s;
    }

    //某个方法的返回值的类型
    public  E f(){
        return s;
    }
    public void show(){
        System.out.println(s.getClass());//显示S的运行类型
    }
}