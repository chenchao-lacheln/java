package com.lacheln.set_;

import java.util.HashSet;

/**
 * HashSetSource
 * HashSet 源码解读
 * @author lacheln
 * @date 2022/7/9 19:27
 * @since 1.0.0
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");//第一次add分析
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("hashSet = " + hashSet);
        /*
        HashSet 源码解读
        1.执行构造器 HashSet
            public HashSet() {
                map = new HashMap<>();
            }
        2.执行 add()
            public boolean add(E e) { // e = "java"
                return map.put(e, PRESENT)==null; // PRESENT = private static final Object PRESENT = new Object(); 占位作用
            }
        3.执行 put()
            public V put(K key, V value) { // key = "java"  value = PRESENT (PRESENT是一个静态的，是共享的)
                return putVal(hash(key), key, value, false, true);
            }
        4. put() 方法会执行 hash(key)方法 得到key对应的hash值 注意：hash值并不是完全等价于hashCode的值（底层里面还有(h = key.hashCode()) ^ (h >>> 16) 这一套算法） // ^ 按位异或
            static final int hash(Object key) {
                int h;
                return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16); // h = key.hashCode() 求key的hashCode值（每一个对象都有一个hashCode值）
                                                                                h >>> 16 h 算术右移16位，主要是为了防止冲突
                                                                                (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16) 如果key等于null就返回0，如果不等于空就按照key传进来的值，得到一个hash的值
            }
        5. 综上 3 和 4 ，面试题题：HashSet里面的add方法中，hash值是不是hashCode？  答案：不是
        6.执行 putVal()  -->> 核心代码
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                           boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;  // 定义辅助变量 2个Node[] 和 1个 int
                // table就是HashMap的一个属性 ， 类型是 Node[]
                // if 语句表示如果当前table 是null，或者 大小 = 0
                // 就是第一次扩容到16空间
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;

                //（1）根据key，得到hash值 去计算该key应该存放到table表的哪个索引位置
                //并把这个位置的对象，赋给辅助变量 p
                //（2） 判断p是否为null
                //（2.1）如果p为null，表示还没有存放元素，就创建一个Node(key = "java",value = PRESENT)
                //（2.2）就放在该位置 tab[i] = newNode(hash, key, value, null);
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    //开发技巧提示：在需要局部变量（辅助变量）的时候，再创建
                    Node<K,V> e; K k; //定义辅助变量
                    // 如果当前索引位置对用的链表的第一个元素和准备添加的key的hash值一样 -->> p.hash == hash
                    //并且满足下面2个条件之一
                    //(1).准备加入的key 和 p 指向的 Node结点的 key 是同一个对象  -->> (k = p.key) == key
                    //(2).p 指向的 Node结点的 key 的equals() 和准备加入的key比较后相同 -->> key != null && key.equals(k)))
                    //就不能加入
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    //再判断 p 是不是一颗红黑树，
                    //如果是一颗红黑树，就调用 putTreeVal 方法，来进行添加
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    //如果table对应的索引位置，已经是一个链表，就使用for循环比较
                    //(1)依次和该链表的每一个元素比较后，都不相同，则加入到该链表的最后   -->> p.next = newNode(hash, key, value, null);
                    //      注意在把元素添加到链表后，立即判断，该链表是否已经达到8个结点  -->> if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                    //      ，就调用 treeifyBin() 对当前这个链表进行树化（转成红黑树）
                    //      注意，在转成红黑树时，要进行判断，判断条件如下
                    //      if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)  // MIN_TREEIFY_CAPACITY == 64
                    //            resize();
                    //      如果上面的条件成立，就先对table进行扩容
                    //      只有上面的条件不成立时，才树化，即才转换成红黑树
                    //(2)依次和该链表的每一个元素比较过程中，如果有相同的情况，就直接break
                    //(3)
                    //(4)
                    else {
                        for (int binCount = 0; ; ++binCount) { // 本质是一个死循环，退出的情况即如下，2个 ，break
                            if ((e = p.next) == null) {
                                p.next = newNode(hash, key, value, null);
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                if (++size > threshold)
                    resize();
                afterNodeInsertion(evict);
                return null;
            }
         */

    }
}
