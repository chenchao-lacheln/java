package com.lacheln.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * SocketTCP01Client
 * 客户端，发送 "hello。server" 给服务端
 * @author lacheln
 * @date 2022/7/27 01:23
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务端(ip ,端口) ，如果链接成功 返回 Socket对象
        //链接 本机的InetAddress.getLocalHost() 9999端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回 = " + socket.getClass());
        //2.连接上后，生成Socket,通过socket.getOutputStream()
        // 得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());
        //设置结束标记
        socket.shutdownOutput();
        //4.获取和socket相关联的输入流，读取数据（以字节的方式读取），并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf, 0, readLen));
        }
        //5.关闭流对象和socket，避免资源浪费
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
