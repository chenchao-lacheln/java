package com.encap;

public class Account {
    //为了封装，将3个属性设置为private
    private String name;
    private double balance;
    private String pwd;

    //提供2个构造器
    public Account() {
    }
    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

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
            System.out.println("余额不足20元，无法进行交易,默认为0");
        }
    }

    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        //判断 密码必须是6位
        if (pwd.length() == 6) {
            this.pwd = pwd;
        }else {
            System.out.println("密码长度错误，必须是6位密码，默认密码为000000");
            this.pwd = "000000";
        }
    }

    //返回属性信息
    public String info(){
        //可以增加权限的校验
        return "该账号的信息如下" + "name = " + name + "\tbalance = " + balance + "\tpwd = " + pwd;
    }

}