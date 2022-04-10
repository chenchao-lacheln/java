package com.extend_.improve_;

import com.extend_.Graduate;
import com.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
       com.extend_.Pupil pupil = new Pupil();
        pupil.name = "小面";
        pupil.age = 24;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();

        System.out.println("=====");
        com.extend_.Graduate graduate = new Graduate();
        graduate.name = "大面";
        graduate.age = 89;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
