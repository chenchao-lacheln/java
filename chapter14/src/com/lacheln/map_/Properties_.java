package com.lacheln.map_;

import java.util.Properties;

/**
 * Properties
 *
 * @author lacheln
 * @date 2022/7/14 09:13
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) {

        //1.Properties 继承了HashTable
        //2.可以通过k-v存放数据，key 和 value 不能为空
        //增加
        Properties properties = new Properties();
        //properties.put(null,"abc");//抛出空指针异常
        //properties.put("abc",null);//抛出空指针异常
        properties.put("jhon",100);
        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",88);//如果有相同的key,value会被替换

        System.out.println("properties =" + properties);

        //通过key  获取对应的值
        System.out.println(properties.get("lic"));//88
        System.out.println(properties.getProperty("lucy"));

        //删除
        properties.remove("lic");
        System.out.println("properties = " + properties);

        //修改
        properties.put("jhon","约翰");
        System.out.println("properties = " + properties);

    }
}
