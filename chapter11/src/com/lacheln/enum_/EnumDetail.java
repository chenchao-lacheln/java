package com.lacheln.enum_;

/**
 * EnumDetail
 *
 * @author lacheln
 * @date 2022/5/20 02:36
 * @since 1.0.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSMUSIC.playing();
    }
}

class A {

}


//使用enum关键字后，就不能再继承其他类了，因为enum会隐式继承Enum，而java是单继承机制，
//enum Session3 exteands A {}

//eenum实现的枚举类，仍然是一个类，所以还是可以实现接口的
interface Iplaying{
    public void playing();
}

enum  Music implements Iplaying{
    CLASSMUSIC;

    @Override
    public void playing() {
        System.out.println("播放好听的音乐");
    }
}