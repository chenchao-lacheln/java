package com.object_;

public class HashCode {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        AA aa2 = aa;

        //1.两个引用，如果指向的是不同的对象，则哈希值是不一样的
        System.out.println("aa.hashCode = " + aa.hashCode());
        System.out.println("aa1.hashCode = " + aa1.hashCode());

        //2。两个引用，如果指向的是同一个的对象，则哈希值是一样的
        System.out.println("aa2.hashCode = " + aa2.hashCode());

        /**
         * aa.hashCode = 692404036
         * aa1.hashCode = 1554874502
         * aa2.hashCode = 692404036
         * 692404036是通过java对象的内部地址，通过一个转换方式得到的，但并不是真正的地址
         */
    }
}

class AA {

}
