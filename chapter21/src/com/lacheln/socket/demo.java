package com.lacheln.socket;

/**
 * demo
 *
 * @author chenchao
 * @date 2022/8/30 4:33 PM
 * @since 1.0.0
 */
public class demo {
    public static void main(String[] args) {
        /**
         * 统计大写字母，小写字母，空格的数量，This is A Test String
         */
        String str = "This is A Test String";
        countStr(str);
    }

    public static void countStr(String str){
        if (str == null){
            System.out.println("str is not null");
            return;
        }

        int strLen = str.length();
        int nullCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (int i = 0;i < strLen;i++){
            if (str.charAt(i) == ' '){
                nullCount++;
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowerCount++;
            }else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upperCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("空格有 = " + nullCount);
        System.out.println("小写字母有 = " + lowerCount);
        System.out.println("大写字母有 = " + upperCount);
        System.out.println("其他字符有 = " + otherCount);


    }
}


