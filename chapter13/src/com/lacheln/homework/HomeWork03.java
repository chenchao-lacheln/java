package com.lacheln.homework;

import java.text.Format;

/**
 * HomeWork03
 *
 * @author chenchao
 * @date 2022/6/8 11:04 AM
 * @since 1.0.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String str = "Willian Jefferson Clinton";
        printName(str);
    }
    //编写程序，输入形式为"Willian Jefferson Clinton"  输出形式为：Clinton,Willian .J 其中J是中间单词的首字母
    /*
    思路分析
    1.对输入的字符串 进行分割， split(" ") 按空格进行分割
    2.对得到的String[] 进行格式化String.format()
    3.对输入的字符串进行校验
     */
    public static void printName(String str){
        if (str == null){
            System.out.println("str 不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3){
            System.out.println("输入的字符串格式不正确");
            return;
        }
        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }

}
