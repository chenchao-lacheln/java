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
//        System.out.println("老用户-原套餐为 正常购买专业版 剩余有效期>1年 升级1年= " + money.regularUsersD1_three("499","118","99","1648691919","1680227919","1685930319","1717552719"));
//        System.out.println("老用户-原套餐为 正常购买专业版 剩余有效期>1年 升级1个月= " + money.regularUsersD1_three("49.9","118","99","1648691919","1680227919","1685930319","1717552719"));
        //System.out.println("老用户-原套餐为 先购买长期版，再购买短期版 剩余有效期>1年 升级1年= " + money.regularUsersD1_one("499","435","1617343903","1932876703"));
        //System.out.println("老用户-原套餐为 先购买长期版，再购买短期版 剩余有效期>1年 升级1个月= " + money.regularUsersD1_one("49.9","435","1617343903","1932876703"));
        //System.out.println("老用户-原套餐为 正常购买1比专业版+有效期有活动赠送的有效期 剩余有效期>1年 升级1年= " + money.regularUsersD1_one("499","181","1619855698","1688191196"));
        //System.out.println("老用户-原套餐为 正常购买1比专业版+有效期有活动赠送的有效期 剩余有效期>1年 升级1个月= " + money.regularUsersD1_one("49.9","181","1619855698","1688191196"));
        //System.out.println("老用户-原套餐为 手动改订单的专业版 剩余有效期>1年 升级1年= " + money.regularUsersD1_one("499","118","1643186311","1674722311"));
        //System.out.println("老用户-原套餐为 手动改订单的专业版 剩余有效期>1年 升级1个月= " + money.regularUsersD1_one("49.9","118","1643186311","1674722311"));
        //System.out.println("老用户-原套餐为 手提取码激活专业版套餐 剩余有效期>1年 升级1年= " + money.regularUsersD1_one("499","202","1633663349","1696735349"));
        //System.out.println("老用户-原套餐为 提取码激活专业版套餐 剩余有效期>1年 升级1个月= " + money.regularUsersD1_one("49.9","202","1633663349","1696735349"));
        //System.out.println("老用户-原套餐为 提取码激活专业版套餐 剩余有效期>1年 升级1年= " + money.regularUsersD1_one("499","196","1620727085","1715421485"));
        //System.out.println("老用户-原套餐为 提取码激活专业版套餐 剩余有效期>1年 升级1个月= " + money.regularUsersD1_one("49.9","196","1620727085","1715421485"));
//        System.out.println("=============老用户 小于1年=============");
//        System.out.println("老用户-原套餐为 正常购买专业版 剩余有效期<1年 升级1年= " + money.regularUsersX1("499", "108", "1659323816", "1627787816"));
//        System.out.println("老用户-原套餐为 正常购买专业版 剩余有效期<1年 升级1个月= " + money.regularUsersX1("49.9", "108", "1659323816", "1627787816"));
        System.out.println("老用户-原套餐为 手动改订单的专业版 剩余有效期<1年 升级1年= " + money.regularUsersX1("499", "81.48", "1676628560", "1658141914"));
        System.out.println("老用户-原套餐为 手动改订单的专业版 剩余有效期<1年 升级1个月= " + money.regularUsersX1("49.9", "81.48", "1676628560", "1658141914"));
//        System.out.println("老用户-原套餐：正常购买1比专业版+有效期有活动赠送的有效期 " + money.regularUsersX1("499", "108", "1659323816", "1619839033"));
//        System.out.println("老用户-原套餐：正常购买1比专业版+有效期有活动赠送的有效期 " + money.regularUsersX1("49.9", "108", "1659323816", "1619839033"));
        //System.out.println("老用户-原套餐为 提取码激活专业版套餐 剩余有效期<1年 升级1年= " + money.regularUsersX1("499", "108", "1661563975", "1630027975"));
        //System.out.println("老用户-原套餐为 提取码激活专业版套餐 剩余有效期<1年 升级1个月= " + money.regularUsersX1("49.9", "108", "1661563975", "1630027975"));
        //System.out.println("老用户-原套餐为 正常购买专业版+优惠券 剩余有效期<1年 升级1年= " + money.regularUsersX1("499", "344", "1659574244", "1628038244"));
        //System.out.println("老用户-原套餐为 正常购买专业版+优惠券 剩余有效期<1年 升级1个月= " + money.regularUsersX1("49.9", "344", "1659574244", "1628038244"));
        //System.out.println("老用户-原套餐为 长期版 剩余有效期<1年 升级1年= " + money.regular3652UsersX1("499", "652", "1680843405"));
        //System.out.println("老用户-原套餐为 长期版 剩余有效期<1年 升级1个月= " + money.regular3652UsersX1("49.9", "652", "1680843405"));


//        Date time31 = tools.getCurrentTime31();
//
//        System.out.println("currentTime = " + Tools.getCurrentTime());
//        Date currentTime3652 = Tools.getCurrentTime3652();
//        System.out.println("currentTime3652 = " + currentTime3652);
//
//        //stampToTime
//        tools.stampToTime(currentTime3652);
//
//        //Formate
//        try {
//            tools.dateToStamp("2032-07-17 16:50:02");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}


