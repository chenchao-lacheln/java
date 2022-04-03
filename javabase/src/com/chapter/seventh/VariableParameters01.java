package com.chapter.seventh;

public class VariableParameters01 {
    public static void main(String[] args) {
        HspMethod m = new HspMethod();
        System.out.println(m.sum(1,2,3,4,5));
    }
}
class HspMethod {
    /*
    1.int...表示接收的是可变参数，类型是int，即可接收多个int(0~n)
    2.使用可变参数时，可以当做数组来使用，即 nums 当做数组来使用
    3.遍历nums求和即可
     */
    public int sum(int... nums){
        System.out.println("接收的可变参数个数=" + nums.length);
        int res = 0;
        for (int i = 0;i < nums.length;i++){
            res += nums[i];
        }
        return res;
    }
}
