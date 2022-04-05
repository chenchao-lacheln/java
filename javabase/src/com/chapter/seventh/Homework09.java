package com.chapter.seventh;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class Homework09 {
    public static void main(String[] args) {
        Music myMusic = new Music("清明雨上",6);
        myMusic.play();
        System.out.println(myMusic.getInfo());
    }
}

/*
定义music类，里面有音乐名name，音乐市场times属性
并有播放功能play和返回本身属性信息的功能方法getInfo
 */

class Music{
    String name;
    int times;
    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }
    //播放功能
    public void play(){
        System.out.println("音乐 = " + name + "\t正在播放中...播放时长为" + times);
    }

    //返回信息
    public String getInfo(){
        return "音乐 = "  + name + "\t播放时间为" + times;
    }
}