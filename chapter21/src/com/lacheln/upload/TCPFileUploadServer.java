package com.lacheln.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCPFileUploadServer
 *
 * @author Lacheln
 * @date 2023/11/20 23:38
 * @since 1.0.0
 * 文件传输服务端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //1.服务端在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听....");
        //2.等待连接
        Socket socket = serverSocket.accept();

         //3.读取客户端发送的数据
        //通过Socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //4.将得到的bytes数组，写入到指定路径，就得到一个文件了
        String destFilePath = "chapter21\\src\\tk2.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        //向客户端回复 “收到图片”
        //通过socket 获取到输出流（字符）
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush();//把内容刷新到数据通道。
        socket.shutdownOutput();//设置写入结束标记

        //关闭其他资源
        writer.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
