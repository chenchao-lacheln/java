package com.lacheln.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap_
 *
 * @author lacheln
 * @date 2022/7/16 12:50
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {
        //使用默认构造器，创建TreeMap，是无序的（也没有排序）
        /*
            按照传入的k(String)的大小进行排序
         */
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照传入的k(String)的大小进行排序-从小到大
//               return ((String)o1).compareTo((String) o2);
                //按照传入的k(String)的大小进行排序-从大到小
//                return ((String)o2).compareTo((String) o1);
                //按照传入的k(String)的长度的大小进行排序
                return ((String)o2).length() - ((String) o1).length();
            }
        });
        treeMap.put("Jack","杰克");
        treeMap.put("Tom","汤姆");
        treeMap.put("KrisTina","克瑞斯提诺");
        treeMap.put("Smith","史密斯");
        //规则：((String)o2).length() - ((String) o1).length();
        treeMap.put("adc","哈哈哈"); // adc 加入不了 但是，value = 哈哈哈 会替换掉 value= 汤姆

        System.out.println("treeMap = " + treeMap);
        /*
            源码解读
            1.构造器，把传入的实现了 Comparator 接口的匿名内部类（对象），传给TreeMap的Comparator
                public TreeMap(Comparator<? super K> comparator) {
                    this.comparator = comparator;
                }
            2.调用put方法
            2.1 第一次添加，把k-v封装到到 Entry对象，放入root
                Entry<K,V> t = root;
                if (t == null) {
                    compare(key, key); // type (and possibly null) check

                    root = new Entry<>(key, value, null);
                    size = 1;
                    modCount++;
                    return null;
                }
             2.2 以后添加，
                Comparator<? super K> cpr = comparator;
                if (cpr != null) {
                    do { //遍历所有的key，给当前的key找适当的位置
                        parent = t;
                        cmp = cpr.compare(key, t.key); //动态绑定到我们的匿名内部类的compare方法
                        if (cmp < 0)
                            t = t.left;
                        else if (cmp > 0)
                            t = t.right;
                        else //如果遍历过程中，发现准备添加的key 和当前已有的key相等，就不添加
                            return t.setValue(value);
                    } while (t != null);
                }
         */
    }
}
