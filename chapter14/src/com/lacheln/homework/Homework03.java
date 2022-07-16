package com.lacheln.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Homework03
 *
 * @author lacheln
 * @date 2022/7/16 21:27
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack",650);//int -->>Integer
        map.put("tom",1200);
        map.put("smith",2900);
        System.out.println("map = " + map);
        //2)将jack的工资更改为2600元
        map.put("jack",2600);
        System.out.println("map = " + map);
        //3)为所有员工工资加薪100元;
        Set keySet = map.keySet();
        for (Object key : keySet) {
            //(Integer)map.get(key) + 100 向下转型
           map.put(key,(Integer)map.get(key) + 100);
        }
        System.out.println("map = " + map);
        //4)遍历集合中所有的员工
        System.out.println("====增强for 遍历集合中所有的员工====");
        for (Object o : keySet) {
            System.out.println(o);
        }
        System.out.println("====迭代器 遍历集合中所有的员工====");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //EntrySet
        System.out.println("====EntrySet-迭代器 遍历集合中所有的员工和工资====");
        Set entrySet = map.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator2.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        //5)遍历集合中所有的工资
        System.out.println("====增强for 遍历集合中所有的工资====");
        for (Object o : keySet) {
            System.out.println(map.get(o));
        }
        System.out.println("====迭代器 遍历集合中所有的工资====");
        Iterator iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(map.get(next));
        }

    }
}
/**
 * 按要求完成下列任务
 * 1)使用HashMap类实例化一个Map类型的对象m,键(String) 和值(int) 分别用于存储员工的姓名和工资，存入数据如下:
 * jack——650元; tom——1200元; smith——2900元;
 * 2)将jack的工资更改为2600元
 * 3)为所有员工工资加薪100元;
 * 4)遍历集合中所有的员工
 * 5)遍历集合中所有的工资
 */
