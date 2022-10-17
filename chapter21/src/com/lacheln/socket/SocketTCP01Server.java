package com.lacheln.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * SocketTCP01Server
 * 服务端
 * @author lacheln
 * @date 2022/7/27 01:16
 * @since 1.0.0
 */
public class SocketTCP01Server {
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
        //4.IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen)); //根据读到的实际长度，显示内容
        }
        //5.关闭流和Socket，避免资源浪费
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
