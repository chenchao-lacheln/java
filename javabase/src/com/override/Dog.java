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

    //子类中编写一个返回类型为String的m1方法
    /**
     * 此时父类中的返回类型为Object，子类中的返回类型为String，因为是继承关系（父子关系），所以也构成了重写关系
     * @return
     */
    public String m1(){
        return null;
    }

//    //父类是public，此时这里子类是protected的话，就会报错，因为子类缩小了父类的访问范围
//    protected void eat(){
//    }
    //细节：子类方法不能缩小父类方法的访问权限
    //public-protected-默认-privated
    public void eat(){

    }
}
