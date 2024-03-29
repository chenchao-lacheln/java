package com.lacheln.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties02
 *
 * @author chaochen
 * @date 2023/5/28
 * @since 1.0.0
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        /**
         * 使用Properties类 来读取mysql.properties类
         */
        //1.创建 Properties 对象
        Properties properties = new Properties();
        //2.加载指定配置文件
        properties.load(new FileReader("chapter19/src/mysql.properties"));
        //3.k-v现实控制台
        properties.list(System.out);
        //4.根据key获取对应值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名 = " + user);
        System.out.println("密码 = " + pwd);

    }

}
