package com.lacheln.set_;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * TestDemo
 *
 * @author chenchao
 * @date 2022/7/6 5:53 PM
 * @since 1.0.0
 */
public class TestDemo {
    public static void main(String[] args) {
        Tool tool = new Tool();
        Money money = new Money();
        //选择的套餐价格 收取的连续订阅价格 下次收费时间
        System.out.println("专业版新用户-原套餐为连续包月-1年 = " + money.isMounthPay("499","11.12","1659767956"));
        System.out.println("专业版新用户-原套餐为连续包月-1个月 = " + money.isMounthPay("49.9","11.12","1659767956"));
        Date time = Tool.getCurrentTime31();
        //时间戳转化时间
        tool.stampToTime(time);

        //时间转换时间戳
        try {
            tool.dateToStamp("2022-08-07 18:25:14");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

//升级费用计算测试
class Tool {
    //update time 获取当前时间
    public final static long getCurrentTime(){
        return System.currentTimeMillis() / 1000 ;
    }
    //update time 获取当前时间 + 31天
    public final static Date getCurrentTime31(){
        //获取系统当前时间
        Calendar instance = Calendar.getInstance();
        //+31天
        instance.add(Calendar.DATE,31);
        //得到最终时间
        Date time = instance.getTime();
        return time;
    }
    //时间戳转时间
    public void stampToTime(Date date1){
        //time format conversion
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = simpleDateFormat.format(date1);
        System.out.println("stampToTime = " + strTime);
    }
    //时间转时间戳
    public void dateToStamp(String date2) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(date2);
        //转化为10位数时间戳
        long time = date.getTime() / 1000;
        res = String.valueOf(time);
        System.out.println("dateToStamp = " + res);
    }
}

//升级费用计算
class Money {
    //原套餐为连续包月
    public BigDecimal isMounthPay(String selectPrice,String originalPrice,String nextChargeTime){
        BigDecimal a = new BigDecimal(selectPrice);
        //收费的连续订阅金额
        BigDecimal b = new BigDecimal(originalPrice);
        //31天
        BigDecimal day1 = new BigDecimal("2592000"); //2592000
        //下一次收费时间
        BigDecimal c = new BigDecimal("1659767956");
        //升级时间
        BigDecimal upgradeTime = new BigDecimal(Tool.getCurrentTime());

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


