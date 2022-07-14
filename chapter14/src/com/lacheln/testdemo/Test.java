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
public class Test {
    public static void main(String[] args) {
        Tools tools = new Tools();
        Moneys money = new Moneys();
        //选择的套餐价格 收取的连续订阅价格 下次收费时间
//        System.out.println("专业版新用户-原套餐为连续包月-1年 = " + money.isMounthPay("499","11.12","1659767956"));
//        System.out.println("专业版新用户-原套餐为连续包月-1个月 = " + money.isMounthPay("49.9","11.12","1659767956"));
//        System.out.println("原套餐为非连续包月剩余有效期>1年 升级1年高性能= " + money.isNotMounthPayMore1("499", "278", "1720600799", "1657528799"));
//        System.out.println("原套餐为非连续包月剩余有效期>1年 升级1个月高性能= " + money.isNotMounthPayMore1("49.9", "278", "1720600799", "1657528799"));
//        //System.out.println("原套餐为非连续包月剩余有效期>1个月 升级1年高性能= " + money.isNotMounthPayMore1("499", "27.8", "1662971104", "1657614304"));
//        System.out.println("原套餐为非连续包月剩余有效期>1个月 升级1个月高性能= " + money.isNotMounthPayMore1("49.9", "27.8", "1662971104", "1657614304"));
//        System.out.println("剩余有效期<1年，价格为1年高性能版价格-剩余价值 升级1年高性能= " + money.isNotMounthPayLess1("499", "139", "1689157768", "1657621768"));
//        System.out.println("剩余有效期<1年，价格为1年高性能版价格-剩余价值 升级1个月高性能= " + money.isNotMounthPayMore1("49.9", "139", "1689157768", "1657621768"));
//        System.out.println("=============老用户 大于1年=============");
//        System.out.println("老用户-原套餐：先购买短期版，再购买长期版 剩余有效期>1年 升级1年= " + money.regularUsersD1("499", "595", "1995840742", "1617149542"));
//        System.out.println("老用户-原套餐：先购买短期版，再购买长期版 = 剩余有效期>1年 升级1个月" + money.regularUsersD1("49.9", "595", "1995840742", "1617149542"));
        System.out.println("老用户-原套餐为 正常购买专业版 剩余有效期>1年 升级1年= " + money.regularUsersD1_three("499","118","99","1648691919","1680227919","1680227919","1717552719"));
        System.out.println("老用户-原套餐为 正常购买专业版 剩余有效期>1年 升级1个月= " + money.regularUsersD1_three("49.9","118","99","1648691919","1680227919","1680227919","1717552719"));

//        System.out.println("=============老用户 小于1年=============");
//        System.out.println("老用户-原套餐为 正常购买专业版 剩余有效期<1年 升级1年= " + money.regularUsersX1("499", "108", "1659323816", "1627787816"));
//        System.out.println("老用户-原套餐为 正常购买专业版 剩余有效期<1年 升级1个月= " + money.regularUsersX1("49.9", "108", "1659323816", "1627787816"));
//        System.out.println("老用户-原套餐：正常购买1比专业版+有效期有活动赠送的有效期 " + money.regularUsersX1("499", "108", "1659323816", "1619839033"));
//        System.out.println("老用户-原套餐：正常购买1比专业版+有效期有活动赠送的有效期 " + money.regularUsersX1("49.9", "108", "1659323816", "1619839033"));


//        Date time31 = tools.getCurrentTime31();
//
//        long currentTime = Tools.getCurrentTime();
//        System.out.println("currentTime = " + currentTime);
//
//        //stampToTime
//        tools.stampToTime(time31);
//
//        //Formate
//        try {
//            tools.dateToStamp("2023-07-12 11:32:57");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}


