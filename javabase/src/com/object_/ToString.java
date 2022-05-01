package com.object_;

public class ToString {
    public static void main(String[] args) {
        /*
        //ToString源码
        1.getClass().getName() 类的全类名（包名+类名）
        2.Integer.toHexString(hashCode()) 将对象的hashCode值转换成16进制的字符串
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */
        Monster monster = new Monster("小妖怪", "巡山", 4000);
        System.out.println("monster.toString() = " + monster.toString() +
                "\nmonster.hashCode() = " + monster.hashCode());

        System.out.println("===当直接输入一个对象时，toString方法会被默认调用===");
        System.out.println(monster); //等价于System.out.println(monster.toString())
    }
}

class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写toString方法，输出对象的属性 command + n
    @Override
    public String toString() {//重写后，一般是把对象的属性输出，也可以自己定制
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
