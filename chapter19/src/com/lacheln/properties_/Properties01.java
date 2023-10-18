package com.lacheln.properties_;

import com.lacheln.BufferedReader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Properties01
 *
 * @author chaochen
 * @date 2023/5/28
 * @since 1.0.0
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        /**
         * 读取mysql.properties文件，并得到 ip user pwd
         */
        BufferedReader br = new BufferedReader(new FileReader("chapter19/src/mysql.properties"));
        String line = "";
        while ((line = br.readLine()) != null){ //循环读取
//            System.out.println(line);
            String[] split = line.split("=");
            //如果要求指定的ip值-->> 处理还是比较麻烦的，因此 可以使用Properties类，方便的实现。
            if ("ip".equals(split[0])) {
                System.out.println(split[0] + "的值是" + split[1]);
            }
        }
        br.close();
    }
}
