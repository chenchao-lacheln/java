package com.chapter.fifth;
import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = myScanner.nextInt();
        if(age >= 18){
            System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱");
        }else{
            System.out.println("虽然你未满18岁，但是也要为自己的行为付出一定的代价");
        }
    }
}
