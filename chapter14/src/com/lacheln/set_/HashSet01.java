package com.lacheln.set_;

import java.util.HashSet;

/**
 * HashSet01
 *
 * @author chenchao
 * @date 2022/7/6 10:19 AM
 * @since 1.0.0
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        // 在执行add方法后 会返回一个Boolean 值
        // 添加成功返回TRUE 添加失败 返回FALSE
        System.out.println(set.add("Jhon"));//T
        System.out.println(set.add("Lucy"));//T
        System.out.println(set.add("Jhon"));//F
        System.out.println(set.add("Jack"));//T
        System.out.println(set.add("lacheln"));//T

        System.out.println("set = " + set);
    }
}
