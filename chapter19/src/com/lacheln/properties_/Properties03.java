package com.lacheln.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties03
 *
 * @author chaochen
 * @date 2023/5/28
 * @since 1.0.0
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用Properties类 来创建配置文件，修改配置文件内容
        Properties properties = new Properties();
        //创建
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆"); //注意保存时，是中文的 unicode码值
        properties.setProperty("pwd","111111");
        //将k-v存储到文件中
        properties.store(new FileOutputStream("chapter19/src/mysql2.properties"),null); //null 可以添加注解
        System.out.println("保存配置文件成功～");
    }
}
