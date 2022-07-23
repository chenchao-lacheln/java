package com.lacheln.cpu_;

/**
 * CpuNum
 *
 * @author lacheln
 * @date 2022/7/20 23:12
 * @since 1.0.0
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量/核心数
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前cpu个数 = " + cpuNums);

        //Thread
    }
}
