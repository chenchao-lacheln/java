package com.lacheln.udp;

import java.io.IOException;
import java.net.*;

/**
 * UDPSendB
 *
 * @author Lacheln
 * @date 2023/11/23 22:45
 * @since 1.0.0
 * 发送端B
 */
public class UDPSendB {
    public static void main(String[] args) throws IOException {
         //1.创建 DatagramSocket 对象，准备在9998 端口接受数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2.将需要发送的数据， 封装到 DatagramPacket 对象
        byte[] data = "hello 明天吃火锅 ~".getBytes();

        //说明：封装的 DatagramPacket 对象 data内容字节数组，data.length ，主机（ip），端口
        DatagramPacket packet = new DatagramPacket(data,data.length, InetAddress.getByName("192.168.1.2"),9999);
        socket.send(packet);

        //3.接收从A端回复的信息
        byte[] receiveData = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(packet1);
        int length = packet1.getLength();
        byte[] data1 = packet1.getData();
        String s = new String(data1,0,length);
        System.out.println(s);


        socket.close();
        System.out.println("B端退出");
    }
}
