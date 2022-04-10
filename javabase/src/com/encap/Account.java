package com.encap;

public class Account {
    public String name;
    private double balance;
    private int pwd;

    public String getName(){
        return name;
    }
    public void setName(String name){
        //判断，姓名长度为2，3或者4位
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else {
            System.out.println("姓名长度输入错误，需要（2-4）个字符，给一个默认名字");
            this.name = "超哥哥";
        }
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        //增加判断，余额必须大于20
        if (balance > 20) {
            this.balance = balance;
        }else {
            System.out.println("余额不足20元，无法进行交易");
        }
    }

    public int getPwd(){
        return pwd;
    }
    public void setPwd(int pwd){
        //判断 密码必须是6位
        if (pwd == 6) {
            this.pwd = pwd;
        }else {
            System.out.println("密码长度错误，必须是6位密码");
        }
    }

    //返回属性信息
    public String info(){
        return "该账号的信息如下" + "name = " + name + "\tbalance = " + balance + "\tpwd = " + pwd;
    }

}