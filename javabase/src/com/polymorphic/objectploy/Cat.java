package com.polymorphic.objectploy;

public class Cat extends Animal1 {

    @Override//表示当前方法重写了父类的cry，@Override会做语法的校验
    public void cry() {
        System.out.println("Cat cry()小猫喵喵叫。。。。");
    }
}
