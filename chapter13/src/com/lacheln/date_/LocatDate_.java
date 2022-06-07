package com.lacheln.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocatDate_
 *
 * @author chenchao
 * @date 2022/6/7 1:34 PM
 * @since 1.0.0
 */
public class LocatDate_ {
    public static void main(String[] args) {
        //使用now()返回当前日期时间的对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //返回当前日期
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);
        //返回当前时间
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);
        System.out.println("年：" + now.getYear());//年
        //数字月份
        System.out.println("月：" + now.getMonth());//月
        //英文月份
        System.out.println("月：" + now.getMonthValue());//月
        System.out.println("日：" + now.getDayOfMonth());//日
        System.out.println("小时：" + now.getHour());//时
        System.out.println("分钟：" + now.getMinute());//分
        System.out.println("秒：" + now.getSecond());//秒

    }
}
