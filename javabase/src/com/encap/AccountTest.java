package com.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("超");
        account.setBalance(10);
        account.setPwd("444");
        System.out.println(account.info());
    }
}
