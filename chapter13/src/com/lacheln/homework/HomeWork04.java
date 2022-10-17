package com.lacheln.homework;

/**
 * HomeWork
 *
 * @author chenchao
 * @date 2022/6/8 12:07 PM
 * @since 1.0.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        String str = "ABCDHBJksabdjkbska12e32r77757哈哈哈";
        countStr(str);
    }
    //输入字符串，判断里面有多少个大写字母，小写字母，多少个数字
    /*
    思路分析
    1.遍历字符串，如果char在'0'~'9'就是一个数字
    2.在'a'~'z'就是一个小写字母
    3.在'A'~'Z'就是一个大写字母
    4.使用3个变量，来记录 统计结果
     */
    public static void countStr(String str){
        if (str == null){
            System.out.println("参数不能为空");
            return;
        }
        //遍历
        int strLen = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (int i = 0; i < strLen; i++) {
            if ( str.charAt(i)>= '0' && str.charAt(i) <= '9'){
                 numCount++;
            }else if (str.charAt(i)>= 'a' && str.charAt(i) <= 'z'){
                lowerCount++;
            }else if (str.charAt(i)>= 'A' && str.charAt(i) <= 'Z'){
                upperCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("数字有 = " + numCount);
        System.out.println("小写字母有 = " + lowerCount);
        System.out.println("大写字母有 = " + upperCount);
        System.out.println("其他字符有 = " + otherCount);
    }
}
