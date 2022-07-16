package com.lacheln.set_;

/**
 * HashSetStructure
 * HashSet底层机制说明
 * @author lacheln
 * @date 2022/7/8 08:11
 * @since 1.0.0
 */
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet底层（HashMap 底层结果）

        //1.创建一个数组，数据的类型是Node[]  Node[] 有些人也称之为表
        Node[] table = new Node[16];
        System.out.println("nodes = " + table);

        //2.创建结点
        Node jhon = new Node("jhon", null);
        table[2] = jhon;
        //3.创建第2个结点
        Node jack = new Node("jack", null);
        jhon.next = jack;//将Jack结点挂载到jhon
        //4.创建第3个结点
        Node rose = new Node("rose", null);
        jack.next = rose;
        System.out.println("nodes = " + table);

        Node lucy = new Node("lucy", null);
        table[3] = lucy;//把 lucy 放在table表的索引为3的位置
        System.out.println("nodes = " + table);


    }
}

class Node { //结点，存储数据，可以指向下一个结点，从而形成链表
    Object iterm; //存放数据
    Node next; //指向下一个结点

    public Node(Object iterm, Node next) {
        this.iterm = iterm;
        this.next = next;
    }
}
