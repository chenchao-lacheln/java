package com.lacheln.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * API_
 * InetAdress的使用
 * @author lacheln
 * @date 2022/7/27 00:49
 * @since 1.0.0
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1.获取本机的InetAdress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost); //lachelndeMacBook-Pro.local/127.0.0.1

        //2.根据指定的主机名 获取 InetAdress对象
        InetAddress host1 = InetAddress.getByName("lachelndeMacBook-Pro.local");
        System.out.println(host1); //lachelndeMacBook-Pro.local/127.0.0.1

        //3.根据域名 返回 InetAdress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2); //www.baidu.com/180.101.49.12

        //4.通过 InetAddress 对象，获取对应的 IP 地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress); // IP 180.101.49.12

        //5.通过 InetAddress 对象，获取对应的 主机名或者域名
        String hostName = host2.getHostName();
        System.out.println(hostName); // www.baidu.com

    }
}
