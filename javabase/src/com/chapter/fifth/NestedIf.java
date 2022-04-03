package com.chapter.fifth;
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入初赛男子的分数：");
        double score = myScanner.nextDouble();

        if (score > 8.0){
            System.out.println("请输入性别：");
            char sex = myScanner.next().charAt(0);
            if (sex == '男'){
                System.out.println("恭喜你，进入了男子组决赛！");
            }
            else if (sex == '女'){
                System.out.println("恭喜你，进入了女子组决赛！");
            }else {
                System.out.println("你的性别输入有误，不能参加9比赛");
            }
        }else {
            System.out.println("很遗憾，祝你好运！");
        }
    }
}
