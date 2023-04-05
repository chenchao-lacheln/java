package com.lacheln.inputstream_;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ObjectIntStream_
 *
 * @author chaochen
 * @date 2023/4/5
 * @since 1.0.0
 * 演示ObjectIntputStream的使用，完成反序列化
 */
public class ObjectIntStream_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/chaochen/tmp/data.bat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        //1.读取（反序列化）的顺序需要和保存（序列化）的顺序保持一致，否则会出现异常
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println("运行类型 = " + dog.getClass());
        System.out.println("dog的信息 = " + dog); // 底层Object -->> Dog

        // 关闭流（否则会造成资源浪费），关闭完成流即可，底层会关闭 FileInputStream
        ois.close();

        /*
        打印类型
        100
        true
        a
        9.5
        超哥来了
        运行类型 = class com.lacheln.outputstream.Dog
        dog的信息 = com.lacheln.outputstream.Dog@6f496d9f （需要重写toString方法才能现实dog信息）
        * */
    }
}
