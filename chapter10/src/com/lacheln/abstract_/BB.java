package com.lacheln.abstract_;

public class BB extends Template{
    @Override
    public void job(){//实现了父类Template的抽象方法
//        //得到开始的时间
//        long begin = System.currentTimeMillis();
        long num = 0;
        for (long i = 1; i <= 10000; i++) {
            num *= i;
        }
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("BB  执行时间 = " + (end - begin));
    }

//    //封装统计时间这个方法，
//    public void calculateTime(){
//        //得到开始的时间
//        long begin = System.currentTimeMillis();
//        job();//只需要更新需要统计的job
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("BB 执行时间 = " + (end - begin));
//    }
}
