package com.chapter.sisth;

import java.util.Scanner;

public class SequenceSearch {
    public static void main(String[] args) {
        String[] name = {"白眉鹰王","青翼蝠王","金毛狮王","紫衫龙王"};
        int index = 0;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你要查找的姓名:");
        String findName = myScanner.next();

        for (int i = 0;i < name.length;i++){
            if (findName.equals(name[i])){
                System.out.println("恭喜你，找到" + findName +"了！");
                index = i;
            }
        }
        if (index == 0){
            System.out.println("sorry,没有找到" + findName);
        }
    }
}
