package com.object_;

public class Equals01 {
    public static void main(String[] args) {
        // == 举例
        //1.引用数据类型，判断地址是否相等
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == b);//true
        System.out.println(b == c);//true

        B obej = a;
        System.out.println(obej == c);//true


        //2.引用数据类型，判断值是否相等
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);

        //equals 方法，怎么查看源代码？
        //把光标放在equals方法，直接输入command + b
        //如果无法使用，则自己配置
        "hello".equals("aaa");
        /*
        //源码阅读 String类的 equals方法
        //把Object 的equals方法重写了，变成了比较两个字符串的值是否相同
            public boolean equals(Object anObject) {
        if (this == anObject) {//如果是同一个对象
            return true;//返回true
        }
        if (anObject instanceof String) {//判断类型是否相等
            String anotherString = (String)anObject;//向下转型
            int n = value.length;//算出长度
            if (n == anotherString.value.length) {//如果长度相同，就转成char数组
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {//然后一个一个的比较字符
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;//如果两个字符串的所有字符都相等，则返回true
            }
        }
        return false;//如果比较的不是字符串，则直接返回false
    }
         */

        //查看Object类的 equals方法
//        Object
        //即Object 的equals方法 默认就是比较对象地址是否相同
        //也就数判断两个对象是不是同一个对象
        /*
        public boolean equals(Object obj) {
        return (this == obj);
         }
         */

        //查看Integer源码
        //从源码可以在看Integer 也重写了Object的equals方法
        Integer integer = new Integer(5);
        /*
            public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
        }
         */
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true

        String lacheln1 = new String("lacheln");
        String lacheln2 = new String("lacheln");
        System.out.println(lacheln1 == lacheln2);//false
        System.out.println(lacheln1.equals(lacheln2));//true


    }
}

class B {

}
class A extends B{

}

