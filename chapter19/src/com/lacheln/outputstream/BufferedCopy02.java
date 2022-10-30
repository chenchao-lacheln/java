package com.lacheln.outputstream;

import java.io.*;

/**
 * BufferedCopy02
 *
 * @author lacheln
 * @date 2022/10/30 10:53
 * @since 1.0.0
 * BufferedOutputStream 和 BufferedInputStream的使用，完成二进制文件拷贝
 * 字节流可以操作二进制文件,可以操作文本文件吗？ 可以
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
//        String srcFilePath = "/Users/lacheln/tmp/picture.jpeg";
//        String destFilePath = "/Users/lacheln/tmp/picture1.jpeg";
        String srcFilePath = "/Users/lacheln/tmp/vedio.mp4";
        String destFilePath = "/Users/lacheln/tmp/vedio1.mp4";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //FileInputStream 是InputStream 的子类
            //class FileInputStream extends InputStream
            //
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环读取文件 到 destFilePath
            byte[] buff = new byte[1024];
            int readLen = 0;
            while ((readLen = bis.read(buff)) != -1){
                bos.write(buff,0,readLen);
            }
            System.out.println("文件拷贝完毕~~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流:关闭外层处理流 即可 底层会去关闭节点流
            try {
                if (bis != null){
                    bis.close();
                }
                if (bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }

    }
}
