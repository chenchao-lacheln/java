package com.lacheln.outputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectOutStream_
 *
 * @author chaochen
 * @date 2023/4/5
 * @since 1.0.0
 * 演示ObjectOutputStream的使用，完成序列化
 */
public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式不是纯文本格式，没有实际意义，而是按照他的格式来保存的
        String filePath = "/Users/chaochen/tmp/data.bat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 /Users/chaochen/tmp/data.bat
        oos.writeInt(100); //int -->> Integer (实现了 Serializable)
        oos.writeBoolean(true); //boolean -->> Boolean (实现了 Serializable)
        oos.writeChar('a'); //char -->> Character (实现了 Serializable)
        oos.writeDouble(9.5); // double -->> Double (实现了 Serializable)
        oos.writeUTF("超哥来了"); // String  (实现了 Serializable)
        // 保存一个dog对象
        // 注意：如果Dog对象没有实现Serializable 会执行程序会抛出异常
        oos.writeObject(new Dog("旺财", 18));

        oos.close();
        System.out.printf("数据保存完毕（序列化形式）");

    }
}
