package com.homework;

public class Homework08 {
    public static void main(String[] args) {
//        ChenkingAccount chenkingAccount = new ChenkingAccount(1000);
//        chenkingAccount.deposit(2000);
//        chenkingAccount.withdraw(100);
//        System.out.println(chenkingAccount.getBalance());

        //测试SavingAccount
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.withdraw(50);
        System.out.println(savingAccount.getCount());
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());

        //月初 定时器 自动调用一下
        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
        System.out.println(savingAccount.getCount());

    }
}
class BankAccount{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }
}

//存款和取款收取1美元的手续费,
class ChenkingAccount extends BankAccount{

    public ChenkingAccount(double balance) {
        super(balance);
    }
    //重写存款
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
        //1块钱入银行的账号
    }
    //重写取款
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
        //1块钱入银行的账号
    }
}

//类SavingAccount每月都有利息产生earnMonthlyInterest，且每月有3次免手续费存款和取款，在earnMonthlyInterest中重置交易次数
class SavingAccount extends BankAccount{

    private int count = 3;
    private double rate = 0.01;//利率

    public SavingAccount(double balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //重写存款
    @Override
    public void deposit(double amount) {
        //判断是否还可以免手续费
        if (count > 0){
            super.deposit(amount);
        }else {
            super.deposit(amount - 1);//1块转入银行
        }
        count --;//减一次
    }

    //重写取款
    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        }else {
            super.withdraw(amount + 1);//1块转入银行
        }
        count --;//减去一次
    }

    public void earnMonthlyInterest(){//每个月初，统计上个月信息，同时将count=3
        count = 3;
        super.deposit(getBalance() * rate);
    }
}
