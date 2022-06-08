package com.lacheln.homework;

/**
 * Homework01
 *
 * @author chenchao
 * @date 2022/6/7 10:19 PM
 * @since 1.0.0
 */
public class Homework01 {
    public static void main(String[] args) {
        //测试
        String str = "abcdefghijk";
        //command option T
        try {
            str = reverse(str, 1, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("交换后的结果=" + str);
    }
    //将字符串中，指定字符进行反转，比如：abcdef  反转为 aedcbf
    /*
    思路分析
    1.确定方法定义
    2.把String转成char[]，因为char[] 的元素可以进行交换
     */
    public static String reverse(String str,int start,int end){
        //对输入的参数做一个验证
        //重要编程技巧！！！！
        //1.写出正确的情况
        //2.取反即可
        if (!(str != null && start >= 0 && end > start && end < str.length())){
            throw new RuntimeException("参数不正确");
        }
        //切换为数组
        char[] chars = str.toCharArray();
        char temp = ' ';//交换辅助变量
        for (int i = start, j = end; i < j; i++ ,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars 重先构建一个 String 返回即可 
        return new String(chars);
    }
}
