package com.lacheln.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * SocketTCP01Server
 * 服务端，使用字符流方式读写
 * @author lacheln
 * @date 2022/7/27 01:16
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的9999端C监听,等待连接
        //  细节：要求 在本机没有其他服务 在监听9999
        //  细节:ServerSocket 可以通过 accept() 返回多个Socker[多个客户端链接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待链接...");
        //2.当没有客户端连接999端口时，程序会阻塞，等待连接
        //  如果有客户端链接，则会返回 Socket 对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket = " + socket.getClass());
        //3.通过socket.getInputStream()读取客户端写入到数据通道的数据，显示
        InputStream inputStream = socket.getInputStream();
        //4.IO读取，使用字符流，使用转换流 InputStreamReader 将 inputStream 转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);//输出

        //5.获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        //使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示回复内容的结束
        bufferedWriter.flush();//需要手动刷新flush

        //6.关闭流和Socket，避免资源浪费
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();

    }
}
