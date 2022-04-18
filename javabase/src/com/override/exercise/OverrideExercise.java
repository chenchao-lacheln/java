package com.override.exercise;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",10);
        System.out.println(person.say());
        Student jack = new Student("jack", 18, 01, 88.9);
        System.out.println(jack.say());
    }
}
