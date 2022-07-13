package com.lacheln.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * MapMethod
 * Map接口常用方法
 * @author lacheln
 * @date 2022/7/10 10:17
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超",new Book("",100));//ok
        map.put("邓超","孙俪");//替换
        map.put("王宝强","马蓉");//ok
        map.put("宋喆","马蓉");//ok
        map.put("刘林福",null);//ok
        map.put(null,"刘亦菲");//ok
        map.put("鹿晗","关晓彤");//ok

        System.out.println("Map = " + map);

        //1. put:添加
        //如上
        //2. remove:根据键删除映射关系
        map.remove(null);
        System.out.println("Map = " + map);
        //3. get:根据键获取值
        Object o = map.get("鹿晗");
        System.out.println("0 = " + o);
        //4. size:获取元素个数
        System.out.println("k-v = " + map.size());
        //5. isEmpty:判断个数是否为0
        System.out.println(map.isEmpty());//False
        //6. clear:清除
        map.clear();
        System.out.println("Map = " + map);
        //7. containsKey:查找键是否存在
        System.out.println(map.containsKey("lacheln"));//False



    }
}

class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}