package com.lacheln.collection_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Collection_
 *
 * @author lacheln
 * @date 2022/6/10 01:29
 * @since 1.0.0
 */
public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        Collection
//        Map
        /*
        1.集合主要分为两组：单列集合和双列集合
        2.Collection 接口有两个重要的子接口 Set 和 List ，他们的实现子类都是单类集合
        3.Map接口的实现子类 是双列集合，存放的是键值对 Key-Value
        4.集合框架体系图 需要记住
         */

        //单列集合
        ArrayList arrayList = new ArrayList();
        arrayList.add("lacheln");

        //双列集合
        HashMap hashMap = new HashMap();
        hashMap.put("NO1","北京");
        hashMap.put("NO2","上海");
    }
}
