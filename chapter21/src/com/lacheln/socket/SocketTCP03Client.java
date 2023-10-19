package com.lacheln.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * SocketTCP01Client
 * 客户端，发送 "hello。server" 给服务端，使用字符流
 * @author lacheln
 * @date 2022/7/27 01:23
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务端(ip ,端口) ，如果链接成功 返回 Socket对象
        //链接 本机的InetAddress.getLocalHost() 9999端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回 = " + socket.getClass());
        //2.连接上后，生成Socket,通过socket.getOutputStream()
        // 得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道，使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello serve , 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine()!!!
        bufferedWriter.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道。


        //4.获取和socket相关联的输入流，读取数据（以字符的方式读取），并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5.关闭流对象和socket，避免资源浪费
        bufferedReader.close();//关闭外层流
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
