package com.lacheln.map_;

import java.util.*;

/**
 * MapFor
 * Map接口遍历方法
 * @author lacheln
 * @date 2022/7/10 10:36
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘林福",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        //第一组：先取出所有的key，通过key 取出对应的value
        Set keySet = map.keySet();
         //(1)增强for
        System.out.println("--------第一种方式--------");
        for (Object key : keySet){
            System.out.println(key + "-" + map.get(key));
        }
        //(2)迭代器
        System.out.println("--------第二种方式--------");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组：把所有的values取出来
        Collection values = map.values();
        //可以使用所有Collections使用的遍历方法
        //(1)增强for
        System.out.println("----增强for取出所有的value----");
        for (Object value : values) {
            System.out.println(value);
        }
        //(2)迭代器
        System.out.println("----迭代器取出所有的value----");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }

        //第三组：通过EntrySet 来获取k-v
        System.out.println("----使用EntrySet的增强for（第3种）----");
        Set entrySet = map.entrySet();//EntrySet<Map.Entry<K,V>>
        //(1)增强for
        for (Object entry : entrySet){
            //将entry转成Map.Entry
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //迭代器
        System.out.println("----使用EntrySet的迭代器（第4种）----");
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object entry = iterator1.next();
            //System.out.println(entry.getClass());//HhashMap$Node -实现了->> Map.Entry(getKey,getValue)
            //向下转型Map.Entry
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }


    }
}
