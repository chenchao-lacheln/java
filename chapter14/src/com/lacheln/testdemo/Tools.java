package com.lacheln.testdemo;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Tools
 *
 * @author chenchao
 * @date 2022/7/8 5:09 PM
 * @since 1.0.0
 */
public class Tools {
    //update time 获取当前时间
    public final static long getCurrentTime(){
        return System.currentTimeMillis() / 1000 ;
    }
    //update time 获取当前时间 + 31天
    public final static Date getCurrentTime31(){
        //获取系统当前时间
        Calendar instance = Calendar.getInstance();
        //+31天
        instance.add(Calendar.DATE,365);
        //得到最终时间
        Date time = instance.getTime();
        return time;
    }
    //update time 获取当前时间 + 365天
    public final static Date getCurrentTime365(){
        //获取系统当前时间
        Calendar instance = Calendar.getInstance();
        //+31天
        instance.add(Calendar.DATE,365);
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
    //剩余价值计算
    //剩余价值：实付金额/总有效期*剩余时间
    public void otherPurchase(){

    }
    //短期版剩余价值=短期版剩余天数*（短期版实付价钱/短期版购买天数）
    public void morePuchase(){

    }
    //长期版剩余价值=长期版剩余天数 *（长期版实付价钱/3652）
    public void lessPuchase(){

    }
}
