package com.lacheln.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * MapSource_
 *
 * @author lacheln
 * @date 2022/7/10 01:05
 * @since 1.0.0
 */
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("No1","张无忌");//k-v
        map.put("No2","刘备");//k-v
        map.put(new Car(),new Person());//k-v

        //1.k-v 最后是 HashMap$Node node = newNode(hash,key,value,null)
        //2.k-v 为了方便程序员的遍历，还会创建 EntrySet集合，该集合存放的元素的类型是Entry，
        // 而一个Entry对象，就有k,v， Entry<Entry<K,V>> ,即：transient Set<Map.Entry<K,Y>> entrySet;
        //3.entrySet 中 定义的类型是 Map.Entry，但是实际上存放的还是HashMap$Node
        // 这是因为 HashMap$Node implements MapEntry
        //4.当把 HashMap$Node 对象 存放到 entrySet 就方便我们遍历,因为 Map.Entry 提供了2个重要的方法
        // K getKey(); V getValue();
        Set set = map.entrySet();
        System.out.println(set.getClass()); //class java.util.HashMap$EntrySet
        for (Object obj : set) {
            //System.out.println(obj.getClass()); //HashMap$Node
            //为了从HashMap$Node 取出k-v
            //1.先做一个向下转型
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        Set set1 = map.keySet();
        System.out.println(set1.getClass()); //class java.util.HashMap$KeySet
        Collection values = map.values();
        System.out.println(values.getClass()); //class java.util.HashMap$Values

    }
}

class Car {}
class Person {}
