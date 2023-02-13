package com.lacheln.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReader_
 *
 * @author chenchao
 * @date 2022/10/20 11:20 AM
 * @since 1.0.0
 * 演示BufferedReader 的使用
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/chenchao/tmp/tcpdump.log";
        // 创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        // 读取
        String line; // 按行读取，效率高
        /*
        说明
        1.bufferedReader.readLine() 是按行读取文件
        2.当返回null时，文件读取完毕
         */
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        //关闭流，注意，只需要关闭bufferedReader，因为底层会自动的去关闭 节点流
        /*
        源码解读
                public void close() throws IOException {
                    synchronized (lock) {
                        if (in == null)
                            return;
                        try {
                            in.close(); // in 就是我们传入的 new FileReader(filePath) ，关闭了 
                        } finally {
                            in = null;
                            cb = null;
                        }
                    }
                }
         */
        bufferedReader.close();
    }
}
