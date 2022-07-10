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
        Date time31 = tools.getCurrentTime31();

        long currentTime = Tools.getCurrentTime();
        System.out.println("currentTime = " + currentTime);

        //stampToTime
        tools.stampToTime(time31);

        //Formate
        try {
            tools.dateToStamp("2022-08-08 19:33:05");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


