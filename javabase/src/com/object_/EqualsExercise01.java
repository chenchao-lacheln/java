package com.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("lacheln", 25, '男');
        Person person2 = new Person("lacheln", 25, '男');
        System.out.println(person1.equals(person2));//false equals默认继承了Object类中equals方法，而Objects默认是比较两个对象是否相等
        //所以上面的Object类中的equals方法不能满足以下要求，则需要重写equals方法，满足要求
    }
}

//判断两个Persond对象的内容是否相等
//判断两个Person对象的各个属性值都一样，则返回true，反之返回false
class Person {//extends Object
    private String name;
    private int age;
    private char gender;

    //重写Objects中的equals方法
    public boolean equals(Object obj){
        //判断 如果比较的两个对象是同一个对象，则直接返回true
        if (this == obj){
            return true;
        }
        //类型判断：判断传进来的obj是不是Person，如果不是Person，是没有办法比较的
        if (obj instanceof Person){//是Person 我们才进行比较
            //进行向下转型因为我们需要得到obj的各个属性，如果不进行向下转型的话 obj没办法使用Person的属性
            Person person = (Person)obj;
            return this.name.equals(person.name) && this.age == person.age && this.gender == person.gender;
        }
        //如果不是Person，则直接返回false
        return false;
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}