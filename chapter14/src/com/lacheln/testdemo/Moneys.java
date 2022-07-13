package com.lacheln.testdemo;

import java.math.BigDecimal;

/**
 * Money
 *
 * @author chenchao
 * @date 2022/7/8 5:11 PM
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
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
    /*
    1.剩余有效期>1年 :价格为1年高性能版价格 -  ∑【订单价格/订单有效日期 *（订单在高性能版本订单生效时间范围内日期）】；
    2.剩余有效期>1月，1个月高性能版价格-∑【订单价格/订单有效日期 *（订单在高性能版本订单生效时间范围内日期）】
        订单价格:所有订单总额
        订单有效日期：到期时间（终单到期时间） - 支付时间 （首单支付时间)
        订单在高性能版本订单生效时间范围内日期： 高性能的生效时间
            高性能的生效时间：1年的时间
    3.剩余有效期>1月，1年高性能版价格-【（1年高性能价格/365 -对应专业版订单价格/有效期） *（订单在专业版本订单生效时间范围内日期）】
     */
    public BigDecimal isNotMounthPayMore1(String selectPrice, String originalPrice, String nextChargeTime,String paymentTime) {
        int temp = -1;
        BigDecimal bigDecimal1 = new BigDecimal(selectPrice);
        BigDecimal bigDecimal2 = new BigDecimal(originalPrice);
        BigDecimal bigDecimal3 = new BigDecimal(nextChargeTime);
        BigDecimal bigDecimal4 = new BigDecimal(paymentTime);
        //订单有效日期
        BigDecimal subtract = bigDecimal3.subtract(bigDecimal4);
        //订单价格/订单有效日期
        BigDecimal divide = bigDecimal2.divide(subtract, 10, BigDecimal.ROUND_DOWN);
        //订单在高性能版本订单生效时间范围内日期
        BigDecimal bigDecimal31 = new BigDecimal("2678365"); //2678365
        BigDecimal bigDecimal365 = new BigDecimal("31535960"); //31535960
        //总价格
        BigDecimal subtract365 = bigDecimal1.subtract(bigDecimal2.divide(subtract, 10, BigDecimal.ROUND_DOWN).multiply(bigDecimal365));
        BigDecimal subtract31 = bigDecimal1.subtract(bigDecimal2.divide(subtract, 10, BigDecimal.ROUND_DOWN).multiply(bigDecimal31));

        return bigDecimal1.intValue() == 499 ? subtract365 : subtract31;
}

    /*
    1.剩余有效期<1年，价格为1年高性能版价格-剩余价值，有效期为升级日+1年
    2.剩余有效期<1月，价格为选择价格-剩余价值，有效期为升级日+1个月
        专业版剩余有效期<选择升级时长的剩余价值：专业版购买金额/总时长*剩余时间；
            实付金额：即所有订单总额
            总有效期 = 到期时间（终单到期时间） - 支付时间 （首单支付时间)
            剩余时间 = 到期时间-当前时间（当前北京时间）
    //传入参数：选择价格 selectPrice 实付金额 originalPrice 到期时间nextChargeTime 支付时间paymentTime 当前时间 Tools.getCurrentTime()
     */
    public BigDecimal isNotMounthPayLess1(String selectPrice, String originalPrice, String nextChargeTime,String paymentTime){
        BigDecimal bigDecimal1 = new BigDecimal(selectPrice);
        BigDecimal bigDecimal2 = new BigDecimal(originalPrice);
        BigDecimal bigDecimal3 = new BigDecimal(nextChargeTime);
        BigDecimal bigDecimal4 = new BigDecimal(paymentTime);
        BigDecimal bigDecimal5 = new BigDecimal(Tools.getCurrentTime());

        //总有效期 = 到期时间（终单到期时间） - 支付时间 （首单支付时间)
        BigDecimal subtract = bigDecimal3.subtract(bigDecimal4);
        //剩余时间 = 到期时间-当前时间（当前北京时间）
        BigDecimal subtract1 = bigDecimal3.subtract(bigDecimal5);
        //剩余价值 = 实付金额/总有效期*剩余时间
        BigDecimal bigDecimal = bigDecimal2.divide(subtract, 10, BigDecimal.ROUND_DOWN).multiply(subtract1);
        //总价格
        return bigDecimal1.subtract(bigDecimal);
    }

    //老用户 剩余有效期大于1年
    public BigDecimal regularUsersD1(String selectPrice, String originalPrice, String nextChargeTime,String paymentTime) {
        BigDecimal bigDecimal1 = new BigDecimal(selectPrice);
        BigDecimal bigDecimal2 = new BigDecimal(originalPrice);
        BigDecimal bigDecimal3 = new BigDecimal(nextChargeTime);
        BigDecimal bigDecimal4 = new BigDecimal(paymentTime);
        //订单有效日期
        BigDecimal subtract = bigDecimal3.subtract(bigDecimal4);
        //订单价格/订单有效日期
        BigDecimal divide = bigDecimal2.divide(subtract, 10, BigDecimal.ROUND_DOWN);
        //订单在高性能版本订单生效时间范围内日期
        BigDecimal bigDecimal31 = new BigDecimal("2678365"); //2678365
        BigDecimal bigDecimal365 = new BigDecimal("31535960"); //31535960
        //总价格:价格为1年高性能版价格 -  ∑【订单价格/订单有效日期 *（订单在高性能版本订单生效时间范围内日期）】
        BigDecimal subtract365 = bigDecimal1.subtract(divide.multiply(bigDecimal365));
        BigDecimal subtract31 = bigDecimal1.subtract(divide.multiply(bigDecimal31));

        return bigDecimal1.intValue() == 499 ? subtract365 : subtract31;
    }
    //老用户 剩余有效期小于1年
    public BigDecimal regularUsersX1(String selectPrice, String originalPrice, String nextChargeTime,String paymentTime) {
        BigDecimal bigDecimal1 = new BigDecimal(selectPrice);
        BigDecimal bigDecimal2 = new BigDecimal(originalPrice);
        BigDecimal bigDecimal3 = new BigDecimal(nextChargeTime);
        BigDecimal bigDecimal4 = new BigDecimal(paymentTime);
        BigDecimal bigDecimal5 = new BigDecimal(Tools.getCurrentTime());

        //总有效期 = 到期时间（终单到期时间） - 支付时间 （首单支付时间)
        BigDecimal subtract = bigDecimal3.subtract(bigDecimal4);
        //剩余时间 = 到期时间-当前时间（当前北京时间）
        BigDecimal subtract1 = bigDecimal3.subtract(bigDecimal5);
        //剩余价值 = 实付金额/总有效期*剩余时间
        BigDecimal bigDecimal = bigDecimal2.divide(subtract, 10, BigDecimal.ROUND_DOWN).multiply(subtract1);
        //总价格
        return bigDecimal1.subtract(bigDecimal);
    }
}
