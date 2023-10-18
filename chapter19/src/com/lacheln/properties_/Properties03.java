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
        //1.如果文件没有key 就是创建
        //2.如果文件有key，就是修改
        /*
        Properties父类是Hashtable，底层就是Hashtable 核心源码如下
        public synchronized V put(K key, V value) {
            // Make sure the value is not null
            if (value == null) {
                throw new NullPointerException();
            }

            // Makes sure the key is not already in the hashtable.
            Entry<?,?> tab[] = table;
            int hash = key.hashCode();
            int index = (hash & 0x7FFFFFFF) % tab.length;
            @SuppressWarnings("unchecked")
            Entry<K,V> entry = (Entry<K,V>)tab[index];
            for(; entry != null ; entry = entry.next) {
                if ((entry.hash == hash) && entry.key.equals(key)) {
                    V old = entry.value;
                    entry.value = value; //如果key存在，就替换
                    return old;
                }
            }

            addEntry(hash, key, value, index);//如果是新k，就addEntry
            return null;

    }
         */
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆"); //注意保存时，是中文的 unicode码值
        properties.setProperty("pwd","88888");
        //将k-v存储到文件中
        properties.store(new FileOutputStream("chapter19/src/mysql2.properties"),null); //null 可以添加注解
        System.out.println("保存配置文件成功～");
    }
}
