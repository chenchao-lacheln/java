package com.lacheln.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Homework01
 *
 * @author lacheln
 * @date 2022/7/18 00:09
 * @since 1.0.0
 */
public class Homework01 {
    public static void main(String[] args) {
    }
    @Test
    public void testList(){
        //给T指定类型是User
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,18,"king"));
        dao.save("003",new User(3,38,"smith"));

        List<User> list = dao.list();
        System.out.println("list = " + list);

        //修改
        dao.update("003",new User(3,58,"m ilan"));
        //删除
        dao.delete("001");
        System.out.println("====修改后====");
        list = dao.list();
        System.out.println("list = " + list);

        //单独获取
        System.out.println("id = 003" + dao.get("003"));
    }
}
/**
 * 定义个泛型类DAO<T>,在其中定义一个Map成员变量，Map的键为String类型，值为T类型。
 * 分别创建以下方法:
 * (1) public void save(String id,T entity):保存T类型的对象到Map成员变量中
 * (2) public T get(String id):从map中获取id对应的对象
 * (3) public void update(String id,T entity):替换map中key为id的内容，改为entity对象
 * (4) public List<T> list(): 返回map中存放的所有T对象
 * (5) public void delete(String id):删除指定id对象
 * 定义一个User类:
 * 该类包含: private成员变量(int类型) id, age; (String 类型)name。
 * 创建DAO类的对象，分别调用其 save、get、 update、 list、 delete 方法来操作User对象，使用Junit单元测试类进行测试。
 *
 * 思路分析
 * 1.定义User类
 * 2.定义Dao<T>泛型类
 */
