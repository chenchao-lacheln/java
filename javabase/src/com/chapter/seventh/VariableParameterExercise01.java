package com.chapter.seventh;

public class VariableParameterExercise01 {
    public static void main(String[] args) {
        HspMethod01 sum = new HspMethod01();
        System.out.println(sum.showScore("陈超" ,80,65,90));
    }
}

class HspMethod01 {
    public String showScore(String name,double... score){
        double res = 0;
        for (int i = 0;i < score.length;i++){
            res += score[i];
        }
        return name + "有" + score.length + "门课，其总分 = " + res;
    }
}