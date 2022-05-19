package com.lacheln.enum_;

/**
 * EnumMethod
 *y演示Enum各种方法的使用
 * @author lacheln
 * @date 2022/5/20 01:34
 * @since 1.0.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Session2 枚举类，来演示各种方法
        Session2 autumn = Session2.AUTUMN;
        //输出枚举对象的名称
        System.out.println(autumn.name());
        //ordinal() 输出的是该枚举对象的次序/编号，从0开始编号，AUTUMN枚举对象是第3个，因此输出是2
        // ordinal可以用来做比较
        System.out.println(autumn.ordinal());
        //从反编译可以看出values()方法，返回Session2[]
        // 含有定义的所有枚举对象
        Session2[] values = Session2.values();
        System.out.println("====遍历取出枚举对象（增强for）====");
        for (Session2 session2 : values){
            System.out.println(session2);
        }
        //valueOf() 将字符串 转换成枚举对象，要求字符串必须转换为已有常量，否则报异常
        //执行流程
        //1.如果你输入的 "AUTUMN" 到 "Session2"的枚举对象去查找
        //2.如果找到了就返回，没找到就报错
        Session2 autumn1 = Session2.valueOf("AUTUMN");
        System.out.println("autumn1 = " + autumn1);
        System.out.println(autumn1 == autumn);

        //compareTo:比较2个枚举常量，比较的就是编号
        //1.就是吧Session2.AUTUMN的枚举对象 和 Session2.SPRING的枚举对象 作比较
        /*
        public final int compareTo(E o) {

        return self.ordinal - other.ordinal;
    }
    Session2.AUTUMN的编号[3] - Session2.SPRING的编号[1] = 2
         */
        System.out.println(Session2.AUTUMN.compareTo(Session2.SPRING));

//        //补充增强for循环
//        int[] nums = {1,2,9};
//        System.out.println("========普通的for========");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println("i = " + nums[i]);
//        }
//        System.out.println("========增强的for========");
//        //执行流程是 依次从nums数组中取出数据，赋给i，取出完毕，则退出for循环
//        for (int i : nums){
//            System.out.println("i = " + i);
//        }

    }
}

