package com.lacheln.list_;

/**
 * Linklist01
 *
 * @author chenchao
 * @date 2022/6/22 1:15 PM
 * @since 1.0.0
 */
public class Linklist01 {
    public static void main(String[] args) {
        //模拟简单的双链表
        Node lacheln = new Node("lacheln");
        Node jack = new Node("jack");
        Node tom = new Node("Tom");

        //连接3个节点，形成双向链表
        //lacheln -> jack -> tom
        lacheln.next = jack;
        jack.next = tom;
        //tom -> jack -> lacheln
        tom.pre = jack;
        jack.pre = lacheln;

        //指定头尾节点
        Node first = lacheln;//让first指向引用lacheln，就是双向链表的头结点
        Node last = tom;//让last指向引用tom，就是双向链表的尾结点

        //演示：从头到尾进行遍历
        System.out.println("====从头到尾进行遍历====");
        while (true){
            if (first == null){
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //演示：从尾到头进行遍历
        System.out.println("====从尾到头进行遍历====");
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        //演示链表添加对象/数据
        //要求在tom和jack之前插入一个marry对象

        //1.创建Node节点 marry
        Node marry = new Node("marry");
        //把marry加入到双向链接
        marry.next = tom;
        marry.pre = jack;
        tom.pre = marry;
        jack.next = marry;

        //让first再次指向Jack
        first = lacheln;

        //演示：从头到尾进行遍历
        System.out.println("====从头到尾进行遍历====");
        while (true){
            if (first == null){
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        last = tom;//让last重先指向最后一个节点
        //演示：从尾到头进行遍历
        System.out.println("====从尾到头进行遍历====");
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

    }
}

//定义一个Node类，Node对象 表示双向链表的一个节点
class Node {
    public Object item;//真正存放数据的地方
    public Node next;//指向后一个节点
    public Node pre;//指向前一个节点
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}