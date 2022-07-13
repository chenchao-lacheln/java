package com.lacheln.testdemo;

import java.text.ParseException;
import java.util.Date;

/**
 * TestDemo
 *
 * @author chenchao
 * @date 2022/7/6 5:53 PM
 * @since 1.0.0
 */
public class TestMain {
    public static void main(String[] args) {
        Tools tools = new Tools();
        Moneys money = new Moneys();
        //选择的套餐价格 收取的连续订阅价格 下次收费时间
        System.out.println("专业版新用户-原套餐为连续包月-1年 = " + money.isMounthPay("499","11.12","1659767956"));
        System.out.println("专业版新用户-原套餐为连续包月-1个月 = " + money.isMounthPay("49.9","11.12","1659767956"));
        System.out.println("原套餐为非连续包月剩余有效期>1年 升级1年高性能= " + money.isNotMounthPayMore1("499", "278", "1720600799", "1657528799"));
        System.out.println("原套餐为非连续包月剩余有效期>1年 升级1个月高性能= " + money.isNotMounthPayMore1("49.9", "278", "1720600799", "1657528799"));
        //System.out.println("原套餐为非连续包月剩余有效期>1个月 升级1年高性能= " + money.isNotMounthPayMore1("499", "27.8", "1662971104", "1657614304"));
        System.out.println("原套餐为非连续包月剩余有效期>1个月 升级1个月高性能= " + money.isNotMounthPayMore1("49.9", "27.8", "1662971104", "1657614304"));
        System.out.println("剩余有效期<1年，价格为1年高性能版价格-剩余价值 升级1年高性能= " + money.isNotMounthPayLess1("499", "139", "1689157768", "1657621768"));
        System.out.println("剩余有效期<1年，价格为1年高性能版价格-剩余价值 升级1个月高性能= " + money.isNotMounthPayMore1("49.9", "139", "1689157768", "1657621768"));

        Date time31 = tools.getCurrentTime31();

        long currentTime = Tools.getCurrentTime();
        System.out.println("currentTime = " + currentTime);

        //stampToTime
        tools.stampToTime(time31);

        //Formate
        try {
            tools.dateToStamp("2023-07-12 11:32:57");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


