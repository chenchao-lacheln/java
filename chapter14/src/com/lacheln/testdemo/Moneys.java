package com.lacheln.testdemo;

import java.math.BigDecimal;
import java.util.Date;

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
        //订单有效日期（套餐有效期）
        BigDecimal subtract = bigDecimal3.subtract(bigDecimal4);
        //订单价格/订单有效日期（套餐每秒平均价格）
        BigDecimal divide = bigDecimal2.divide(subtract, 10, BigDecimal.ROUND_DOWN);
        //订单在高性能版本订单生效时间范围内日期
        BigDecimal bigDecimal31 = new BigDecimal("2678365"); //2678365
        BigDecimal bigDecimal365 = new BigDecimal("31535960"); //31535960
        //总价格:价格为1年高性能版价格 -  ∑【订单价格/订单有效日期 *（订单在高性能版本订单生效时间范围内日期）】
        BigDecimal subtract365 = bigDecimal1.subtract(divide.multiply(bigDecimal365));
        BigDecimal subtract31 = bigDecimal1.subtract(divide.multiply(bigDecimal31));

        return bigDecimal1.intValue() == 499 ? subtract365 : subtract31;
    }

    //老用户 长期版 升级的套餐的有效期  在套餐1内
    public BigDecimal regularUsersD1_one(String selectPrice, String o1, String start1, String end1) {
        //31天
        BigDecimal bigDecimal31 = new BigDecimal("2678365"); //2678365
        //365天
        BigDecimal bigDecimal365 = new BigDecimal("31535960"); //31535960
//        System.out.println("365天时间戳值 = " + bigDecimal365);
        BigDecimal bigDecimal1 = new BigDecimal(selectPrice);
        BigDecimal bigDecimal2 = new BigDecimal(o1);
        BigDecimal bigDecimal3 = new BigDecimal(start1);
        BigDecimal bigDecimal4 = new BigDecimal(end1);

        //当前时间戳
        long currentTime = Tools.getCurrentTime();
        BigDecimal current = BigDecimal.valueOf(currentTime);

        //套餐1有效期
        BigDecimal date1 = bigDecimal4.subtract(bigDecimal3);
//        System.out.println("套餐1有效期 = " + bigDecimal4 + " - " + bigDecimal3 + " = " + date1);
        //套餐1每秒价格
        BigDecimal price1 = bigDecimal2.divide(date1,10,BigDecimal.ROUND_DOWN);
//        System.out.println("套餐1每秒价格 = " + bigDecimal2 + " / " + date1 + " = " + price1);

        //套餐1在高性能版本有效期内价格
        //365年套餐 升级套餐在原套餐内
        BigDecimal result365 = bigDecimal1.subtract(price1.multiply(bigDecimal365));
        //365年套餐  升级套餐部分在原套餐内
        //BigDecimal result365 = bigDecimal1.subtract(price1.multiply(bigDecimal4.subtract(current)));
//        System.out.println(bigDecimal1 + " - " + price1 + " * " + bigDecimal365 + " = " + result365);
        BigDecimal result31 = bigDecimal1.subtract(price1.multiply(bigDecimal31));
//        System.out.println(bigDecimal1 + " - " + price1 + " * " + bigDecimal31 + " = " + result31);
        return bigDecimal1.intValue() == 499 ? result365 : result31;
    }

    //老用户 剩余有效期大于1年
    public BigDecimal regularUsersD1_three(String selectPrice, String o1,String o2,
                                           String start1, String end1,String start2, String end2) {
        BigDecimal bigDecimal1 = new BigDecimal(selectPrice);
        BigDecimal bigDecimal2 = new BigDecimal(start1);
        BigDecimal bigDecimal3 = new BigDecimal(end1);
        BigDecimal bigDecimal5 = new BigDecimal(start2);
        BigDecimal bigDecimal6 = new BigDecimal(end2);

        //套餐1原订单价格
        BigDecimal bigDecimal9 = new BigDecimal(o1);
        System.out.println("套餐1原订单价格 = " + bigDecimal9);
        BigDecimal bigDecimal10 = new BigDecimal(o2);
        System.out.println("套餐2原订单价格 = " + bigDecimal10);


        //套餐1 - 订单有效日期（套餐有效期）
        BigDecimal subtract1 = bigDecimal3.subtract(bigDecimal2);
        System.out.println("套餐1有效期 = " + bigDecimal3 + " - " + bigDecimal2 + " = " + subtract1);
        //套餐2 - 订单有效日期（套餐有效期）
        BigDecimal subtract2 = bigDecimal6.subtract(bigDecimal5);
        System.out.println("套餐2有效期 = " + bigDecimal6 + " - " + bigDecimal5 + " = " + subtract2);


        //套餐1 - 订单价格/订单有效日期（套餐每秒平均价格）
        BigDecimal divide1 = bigDecimal9.divide(subtract1, 10, BigDecimal.ROUND_DOWN);
        System.out.println("套餐1每秒平均价格 = " + bigDecimal9 + "/" + subtract1 + "=" + divide1);
        //套餐2 - 订单价格/订单有效日期（套餐每秒平均价格）
        BigDecimal divide2 = bigDecimal10.divide(subtract2, 10, BigDecimal.ROUND_DOWN);
        System.out.println("套餐2每秒平均价格 = " + bigDecimal10 + "/" + subtract2 + "=" + divide2);


        //当前时间
        long currentTime = Tools.getCurrentTime();
        BigDecimal current = BigDecimal.valueOf(currentTime);
        System.out.println("当前时间戳 = " + current);
        //31
        BigDecimal bigDecimal31 = new BigDecimal("2678365"); //2678365
//        System.out.println(" 31天时间戳= " + bigDecimal31);

        //当前时间+365
        BigDecimal bigDecimal365 = new BigDecimal("31535960"); //31535960
        BigDecimal add365 = current.add(bigDecimal365);
        System.out.println("当前时间+365 =" + add365);
//        System.out.println("当前时间+365 = " + add365);

        //套餐1在高性能版本有效期内价格
        BigDecimal gt1 = bigDecimal3.subtract(current);
        System.out.println(bigDecimal3 + "-" + current + " = " + gt1);
        BigDecimal price1 = gt1.multiply(divide1);
        System.out.println("套餐1在高性能版本有效期内价格:" + gt1 + " * " + divide1 + " = " + price1);
        System.out.println("====================");
        //套餐2在高性能版本有效期内价格
        BigDecimal gt2 = add365.subtract(bigDecimal5);
        System.out.println(add365 + "-" + bigDecimal5 + " = " + gt2);
        BigDecimal price2 = gt2.multiply(divide2);
        System.out.println("套餐2在高性能版本有效期内价格:"+ gt2 + " * " + divide2 + " = " + price2);
//        BigDecimal bigDecimal31 = new BigDecimal("2678365"); //2678365
//        BigDecimal bigDecimal365 = new BigDecimal("31535960"); //31535960
        //总价格:价格为1年高性能版价格 -  ∑【订单价格/订单有效日期 *（订单在高性能版本订单生效时间范围内日期）】
        BigDecimal subtract365 = bigDecimal1.subtract(price1).subtract(price2);
        BigDecimal subtract31 = bigDecimal1.subtract(divide1.multiply(bigDecimal31));


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


        //剩余时间 = 到期时间-当前时间（当前北京时间）--套餐结束时间 大于 nextChargeTime
        //BigDecimal subtract1 = bigDecimal3.subtract(bigDecimal5);
        //剩余时间 = 到期时间-当前时间（当前北京时间）--套餐结束时间 小于 nextChargeTime
        BigDecimal subtract1 = new BigDecimal("2678365"); //2678365



        //剩余价值 = 实付金额/总有效期*剩余时间
        BigDecimal bigDecimal = bigDecimal2.divide(subtract, 10, BigDecimal.ROUND_DOWN).multiply(subtract1);

        //总价格
        return bigDecimal1.subtract(bigDecimal);
    }
    //老用户 剩余有效期小于1年
    public BigDecimal regular3652UsersX1(String selectPrice, String originalPrice, String nextChargeTime) {
        BigDecimal bigDecimal1 = new BigDecimal(selectPrice);
        BigDecimal bigDecimal2 = new BigDecimal(originalPrice);
        BigDecimal bigDecimal3 = new BigDecimal(nextChargeTime);
//        BigDecimal bigDecimal4 = new BigDecimal(paymentTime);
        BigDecimal bigDecimal5 = new BigDecimal(Tools.getCurrentTime());

        //总有效期 = 到期时间（终单到期时间） - 支付时间 （首单支付时间)
//        BigDecimal subtract = bigDecimal3.subtract(bigDecimal4);


        //长期版剩余天数 = 到期时间-当前时间（当前北京时间）--套餐结束时间 大于 nextChargeTime
        BigDecimal subtract1 = bigDecimal3.subtract(bigDecimal5);
        //长期版剩余天数 = 到期时间-当前时间（当前北京时间）--套餐结束时间 小于 nextChargeTime

        //3652
        BigDecimal bigDecimal3652 = new BigDecimal("315532757"); //315532757



        //剩余价值 = 实付金额/总有效期*剩余时间
        //长期版剩余价值=长期版剩余天数 *（长期版实付价钱/3652）
        BigDecimal bigDecimal = subtract1.multiply(bigDecimal2.divide(bigDecimal3652,10,BigDecimal.ROUND_DOWN));

        //总价格
        return bigDecimal1.subtract(bigDecimal);
    }
}
