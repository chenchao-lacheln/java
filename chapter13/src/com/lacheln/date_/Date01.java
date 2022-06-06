package com.lacheln.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date01
 *
 * @author chenchao
 * @date 2022/6/6 8:06 PM
 * @since 1.0.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();//获取当前系统时间
        System.out.println(date);

        //日期格式转换
        //创建 SimpleDateFormat对象可以指定相应格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);//format 将日期转换为指定格式的字符串
        System.out.println(format);
        Date date1 = new Date(9234567);//指定毫秒数 获取时间
        System.out.println(date1);
        System.out.println(date.getTime());//获取某个时间 对应的毫秒数
        //可以把一个格式化的String转换成对应的Date
        //得到的date 在输出时，仍然是国外的形式，如果需要指定格式，需要转换
        //把String 转化成 Date 使用的simpleDateFormat格式需要和给的String格式一样，否则会抛出转化异常
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = simpleDateFormat.parse(s);//parse这里有个异常，可以抛出异常option+回车
        System.out.println(parse);
        System.out.println(simpleDateFormat.format(parse));
    }
}
