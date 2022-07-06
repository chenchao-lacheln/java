package com.lacheln.set_;

import java.text.SimpleDateFormat;

/**
 * TestDemo
 *
 * @author chenchao
 * @date 2022/7/6 5:53 PM
 * @since 1.0.0
 */
public class TestDemo {
    public static void main(String[] args) {
        UpgradeCost upgradeCost = new UpgradeCost();
        // 499 - (11.12 / 31) * ( 1659767956 - 1657098931)=487.92
        double oneYearCla1 = upgradeCost.CostCalculation(499, 11.12, 31, 1657098931);
        System.out.println("专业版新用户-原套餐为连续包月-1年 = " + oneYearCla1);
        double oneYearCla2 = upgradeCost.CostCalculation(49.9, 11.12, 31, 1657098931);
        System.out.println("专业版新用户-原套餐为连续包月-1个月 = " + oneYearCla2);


    }
}
//1.升级日开始计算有效期
//2.1年：价格为1年价格-【收费的连续订阅金额/31天*（下一次收费时间-升级时间）】；

//升级费用计算测试
class UpgradeCost {
    //价格 原订单金额 天数 下次收费时间 升级时间
    private double price;
    private double OriginalOrderAmount;
    private int day = 31;
    private long nextChargeTime;

    public UpgradeCost() {
    }

    public UpgradeCost(double price, double originalOrderAmount, int day, long nextChargeTime) {
        this.price = price;
        OriginalOrderAmount = originalOrderAmount;
        this.day = day;
        this.nextChargeTime = nextChargeTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOriginalOrderAmount() {
        return OriginalOrderAmount;
    }

    public void setOriginalOrderAmount(double originalOrderAmount) {
        OriginalOrderAmount = originalOrderAmount;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public long getNextChargeTime() {
        return nextChargeTime;
    }

    public void setNextChargeTime(long nextChargeTime) {
        this.nextChargeTime = nextChargeTime;
    }

    //update time
    public final static long upgradeTime(){
        return System.currentTimeMillis() / 1000 ;
    }

    public void TimeChange(Long l){
        //转换格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = simpleDateFormat.format(l);
        System.out.println(strTime);
    }
    public double CostCalculation(double price,double originalOrderAmount,int day,long nextChargeTime ){
        return price - (originalOrderAmount / day) * (nextChargeTime - upgradeTime());
    }
}


