package com.chapter.seventh;

public class HanoiTower {
    public static void main(String[] args) {
        Tower test3 = new Tower();
        test3.move(5, 'A', 'B', 'C');
    }
}

class Tower {

    //nums 表示要移动的个数，a, b , c 分别表示三个塔
    public void move(int nums, char a, char b, char c) {
        if (nums == 1) {
            System.out.println(a + "-->" + c);
        } else {
            //如果有多个盘，可以看成两个，最上面的所有（nums - 1）和最下面的一个
            //1.先移动a上面的盘到b，借助c
            move(nums - 1, a, c, b);
            //2.再移动a下面的盘到c，借助b
            System.out.println(a + "-->" + c);
            //3.再移动b上面的所有的盘到a，借助c
            move(nums - 1, b, a, c);

        }
    }
}
