package com.chapter.sisth;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array ={5,3,6,2,1,4,8,7}; //{1,2,3,4,5}   {24,80,69,57,13}
        int temp = 0;
//        数组是否从小到大排序，默认true，默认已经是排序好了
        int number = 0;
//外层循环是4层
            for (int i = 0; i < array.length - 1; i++) {
//                //表示是否发生交换操作，每轮结束后置为false
                boolean isOccurExchange = false;
                for (int j = 0; j < array.length - 1 - i; j++) { /* 4次比较 -3次 -2次 -1次*/
//                如果前面的数大于后面的数，就交换
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        isOccurExchange = true;
                    }
                }
                number++;
//                //说明这轮没有发生元素交换，数组已经有序
                if (!isOccurExchange){ //isOccurExchange == false  等价于 !isOccurExchange
                    break;
                }
//            System.out.println("\n==第" + (i+1) + "轮==");
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[j] + "\t");
//            }
        }
        System.out.println("总共经过" + number + "轮冒泡排序");
        System.out.println("\n最终排序结果如下:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
