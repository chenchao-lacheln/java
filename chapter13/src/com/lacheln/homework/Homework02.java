package com.lacheln.homework;

/**
 * Homework02
 *
 * @author lacheln
 * @date 2022/6/8 01:32
 * @since 1.0.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String name = "jack1";
        String pwd = "123455";
        String email = "74236@qq.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你。注册成功！！！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*
    1.输入用户名 密码 邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
    2.要求
    2.1用户名 长度为 2或3或4
    2.2密码的长度为6，要求全是数字
    2.3邮箱中包好@和. 并且@在.的前面

    需要单独写一个方法，判断 密码是否全是数字字符Boolean
     */
    public static void userRegister(String name,String pwd,String email){
        //添加其他校验
        if (!(name != null && pwd != null || email != null)){
            throw new RuntimeException("参数不能为空");
        }

        int userlength = name.length();
        if (!(userlength >= 2 || userlength <= 4)){
            throw new RuntimeException("用户名长度为2或3或4");
        }
        if (!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码的长度为6，要求全是数字");
        }
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)){
            throw new RuntimeException("邮箱中包好@和. 并且@在.的前面");
        }
    }

    //需要单独写一个方法，判断 密码是否全是数字字符Boolean
    public static boolean isDigital(String str){
        //转换成字符串数组
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' && chars[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
