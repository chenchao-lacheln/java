package com.override;

public class Dog extends Animal{
    /**
     * 1.因为Dog是Animal的子类
     * 2.Dog的cay和Animal的cry定义形式一样（名称，返回类型，参数）
     * 3.这时，我们就说Dog的cry方法重写了Animal的cry方法
     */
    public void cry(){
        System.out.println("小狗汪汪叫。。");
    }
}
