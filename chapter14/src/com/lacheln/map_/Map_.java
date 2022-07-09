package com.lacheln.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * Map_
 * Map接口实现类的特点
 * @author lacheln
 * @date 2022/7/10 00:42
 * @since 1.0.0
 */
public class Map_ {
    public static void main(String[] args) {
        // Map接口实现类的特点 使用实现类HashMap
        //1.Map与Collection并列存在。用于保存具有映射关系的数据:Key-Value (双列元素)
        Map map = new HashMap();
        map.put("No1","张无忌");//k-v
        map.put("No2","刘备");//k-v
        System.out.println("map = " + map);
        //2. Map中的key和value 可以是任何引用类型的数据，会封装到HashMap$Node对象中
        //3. Map中的key不允许重复，原因和HashSet 一样，前面分析过源码.
        map.put("No1","张三丰");//当有相同的 k 时，就等价于替换
        System.out.println("map = " + map);
        //4. Map中的value可以重复
        map.put("No3","张无忌");//k-v
        System.out.println("map = " + map);
        //5. Map的key可以为null, value也可以为null ,注意key为null,只能有一个，value为null ,可以多个.
        map.put("null","null");
        map.put("null","abc");//等价于替换
        map.put("No4","null");//k-v
        map.put("No5","null");//k-v
        System.out.println("map = " + map);
        //6.常用String类作为Map的key
        //7. key和value之间存在单向一对一关系， 即通过指定的key总能找到对应的value
        System.out.println("No1 = " + map.get("No1"));
    }
}
