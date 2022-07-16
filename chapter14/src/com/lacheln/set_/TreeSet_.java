package com.lacheln.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet_
 *
 * @author lacheln
 * @date 2022/7/16 11:37
 * @since 1.0.0
 */
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        /*
        1.当我们使用无参构造器，创建TreeSet时，仍然是无序的
        2.希望添加的元素，按照字母大小来排序
        3.使用TreeSet 提供的一个构造器，可以传入一个比较器（匿名内部类），并指定排序规则
         */
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用String的 compareTo 方法进行字符串的大小比较
                //按照字母顺序排序
                //return ((String)o1).compareTo((String) o2);
                //按照字母逆序排序
                //return ((String)o2).compareTo((String) o1);
                //要求加入的元素，按照长度大小排序
                return ((String)o2).length() - ((String) o1).length();
            }
        });
        treeSet.add("Jack");
        treeSet.add("Tom");//3
        treeSet.add("Lacheln");
        treeSet.add("Marry");
        // treeSet.add("abc"); 无法加入，因为return ((String)o2).length() - ((String) o1).length();
        // 这里的规则是长度相等就是同一元素
        treeSet.add("abc");

        System.out.println("treeSet = " + treeSet);

        /*
        源码解读
        1.构造器把传入的比较器对象，赋给了TreeSet的底层的TreeMap的属性 this.comparator
            public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }

        2.在 调用 treeSet.add("Tom") ，在底层会执行到
            if (cpr != null) { //cpr 就是我们的匿名内部类（对象）
                do {
                    parent = t;
                    //动态绑定到 我们的匿名内部类（对象）compare
                    cmp = cpr.compare(key, t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else //如果相等，即返回0，这个key就没有加入了
                        return t.setValue(value);
                } while (t != null);
            }
         */

    }
}
