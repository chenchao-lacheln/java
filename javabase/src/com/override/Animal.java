package com.override;

public class Animal {
    public void cry(){
        System.out.println("动物叫唤");
    }

    //父类中编写一个返回类型为Object的m1方法
    public Object m1(){
        return null;
    }

    //细节：子类方法不能缩小父类方法的访问权限
    //public-protected-默认-privated
    protected void eat(){

    }
}
