package com.lacheln.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDPReceiveA
 *
 * @author Lacheln
 * @date 2023/11/23 22:45
 * @since 1.0.0
 * 接收端A
 */
public class UDPReceiveA {
    public static void main(String[] args) throws IOException {
        //1.创建一个 DataGramPacket对象，准备在9999接受数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2.构建一个 DatagramPacket 对象，准备接收数据
        //UDP协议时，一个数据包最大64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        //3.调用 接收方法，将通过网络传输的 DatagramPacket 对象
        //  填充到 packet 对象
        //提示：当有数据包发送到 本机的9999端口时，就会接收到数据
        //    如果没有数据包发送到 本机的9999端口，就会阻塞等待。
        System.out.println("接收端A 等待接受数据。。。");
        socket.receive(packet);

        //4.可以把packet 进行拆包 ，取出数据并显示。
        int length = packet.getLength(); //实际接受到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data,0,length);
        System.out.println(s);

        //回复信息个B端，发送 “好的，明天见”
        byte[] sendData = "好的，明天见".getBytes();
        DatagramPacket packet1 = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("192.168.1.2"),9998);
        socket.send(packet1);

        //5.关闭资源
        socket.close();
        System.out.println("A端退出");
    }
}
