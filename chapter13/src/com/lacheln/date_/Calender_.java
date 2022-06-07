package com.lacheln.date_;

import java.util.Calendar;

/**
 * Calender_
 *
 * @author chenchao
 * @date 2022/6/7 1:11 PM
 * @since 1.0.0
 */
public class Calender_ {
    public static void main(String[] args) {
        /*
        Calender是一个抽象类，且构造器是private
        可以用个getInstance来获取实例
         */
        Calendar instance = Calendar.getInstance();//创建日历类对象
        System.out.println(instance);
        //获取日历对象的某个日历字段
        System.out.println("年：" + instance.get(Calendar.YEAR));
        //需要+1 因为返回月的时候 是按照 0开始编号的
        System.out.println("月：" + (instance.get(Calendar.MONTH) + 1));
        System.out.println("日：" + instance.get(Calendar.DAY_OF_MONTH));
        //12进制的更改为24进制的Calendar.HOUR  ==>>HOUR_OF_DAY
//        System.out.println("小时：" + instance.get(Calendar.HOUR));
        System.out.println("小时：" + instance.get(Calendar.HOUR_OF_DAY));
        System.out.println("分钟：" + instance.get(Calendar.MINUTE));
        System.out.println("秒：" + instance.get(Calendar.SECOND));
        //Calendar没有专门的格式化方法，需要自己进行组合
        System.out.println(instance.get(Calendar.YEAR) + "-" + (instance.get(Calendar.MONTH) + 1) + "-" + instance.get(Calendar.DAY_OF_MONTH) + " " +
                instance.get(Calendar.HOUR_OF_DAY) + ":" + instance.get(Calendar.MINUTE) + ":" + instance.get(Calendar.SECOND));

    }
}
