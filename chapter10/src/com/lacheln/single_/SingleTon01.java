package com.lacheln.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        //可以创建2个女朋友，就不是单例
        GirlFriend girlFriend = new GirlFriend("花花");
        GirlFriend girlFriend1 = new GirlFriend("兰兰");

    }
}

//有一个类GirlFriend
//只能有一个女朋友
class GirlFriend{

    private String name;

    //如何保证我们只能创建一个 GirlFriend 对象
    public GirlFriend(String name) {
        this.name = name;
    }
}
