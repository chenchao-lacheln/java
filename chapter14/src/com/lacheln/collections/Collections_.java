package com.lacheln.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections_
 *
 * @author lacheln
 * @date 2022/7/16 13:20
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
//        java.util.Collections;
        //创建ArrayList集合
        ArrayList list = new ArrayList();
        list.add("Tom");
        list.add("Smith");
        list.add("King");
        list.add("Milan");

//        1) reverse(List):反转List中元素的顺序
        Collections.reverse(list);
        System.out.println("list = " + list);
//        2) shuffle(List):对List集合元素进行随机排序
//        for (int i = 0;i < 5;i++) {
//            Collections.shuffle(list);
//            System.out.println("list = " + list);
//        }
//        3) sort(List):根据元素的自然顺序对指定List集合元素按升序排序
        Collections.sort(list);
        System.out.println("list = " + list);
//        4) sort(List, Comparator): 根据指定的Comparator产生的顺序对List集合元素进行排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //可以加入校验代码
                if (o1 instanceof String) {
                    return ((String) o1).length() - ((String) o2).length();
                }else {
                    return 0;
                }
            }
        });
        System.out.println("list = " + list);
//        5) swap(List, int,int):将指定list集合中的i处元素和j处元素进行交换
        Collections.swap(list,0,1);
        System.out.println("list = " + list);


        //6) Object max(Collection):根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println("自然顺序的最大元素 = " + Collections.max(list));
        //7) Object max(Collection, Comparator): 根据Comparator指定的顺序，返回给定集合中的最大元素
        //比如：返回长度最大的数
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println("长度最大的数 = " + maxObject);
        //8) Object min(Collection)
        //9) Object min(Collection, Comparator)
        //10) int frequency(Collection, Object): 返回指定集合中指定元素的出现次数
        System.out.println("Tom出现的次数  = " + Collections.frequency(list,"Tom"));
        //11) void copy(List dest,List src):将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完成一个完整拷贝，需要先给dest赋值，大小和list.size()一样
        for (int i = 0;i < list.size();i++){
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println("dest = " + dest);
        //12) boolean replaceAll(List list, Object oldVal, Object newVal):使用 新值替换List对象的所有旧值
        //如果list中有Tom，就替换成 汤姆
        Collections.replaceAll(list,"Tom","汤姆");
        System.out.println("list替换后 = " + list);

    }
}
