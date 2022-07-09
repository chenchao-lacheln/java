package com.lacheln.testdemo;

import java.math.BigDecimal;

/**
 * Money
 *
 * @author chenchao
 * @date 2022/7/8 5:11 PM
 * @since 1.0.0
 */
public class Moneys {
    //原套餐为连续包月
    public BigDecimal isMounthPay(String selectPrice, String originalPrice, String nextChargeTime){
        Tools tools = new Tools();
        BigDecimal a = new BigDecimal(selectPrice);
        //收费的连续订阅金额
        BigDecimal b = new BigDecimal(originalPrice);
        //31天
        BigDecimal day1 = new BigDecimal("2678365"); //2678365
        //下一次收费时间
        BigDecimal c = new BigDecimal("1659767956");
        //升级时间
        BigDecimal upgradeTime = new BigDecimal(tools.getCurrentTime());

        //金额计算
        //收费的连续订阅金额/31天
//        BigDecimal divide = originalOrderAmount.divide(day,10,BigDecimal.ROUND_DOWN);
//        System.out.println("收费的连续订阅金额/31天 = " + divide);
        //下一次收费时间-升级时间
//        BigDecimal subtract = nextChargeTime.subtract(upgradeTime);
//        System.out.println("下一次收费时间-升级时间 = " + subtract);
        //结果
//        BigDecimal multiply = divide.multiply(subtract);
        return a.subtract(b.divide(day1, 10, BigDecimal.ROUND_DOWN).
                multiply(c.subtract(upgradeTime)));
    }

    //原套餐为非连续包月
    public void isNotMounthPay(){
    }
}
