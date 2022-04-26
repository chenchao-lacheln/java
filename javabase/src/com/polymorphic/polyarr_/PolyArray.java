package com.polymorphic.polyarr_;

public abstract class PolyArray {
    public static void main(String[] args) {
        //应用实例：现在有一个继承结构如下：要求创建一个Person对象、2个Student对象、2个Teacher对象，
        //统一放在数组中，并调用每个对象的say方法

        //父类的引用可以指向子类的对象，Person以及Person的子类对象，都可以放
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("mary",18,100);
        persons[2] = new Student("smith",19,30.1);
        persons[3] = new Teacher("scott",30,20000);
        persons[4 ] = new Teacher("king",50,25000);

        //循环遍历多态数组，调用say方法
        for (int i = 0;i < persons.length;i++){
            //persons[i]编译类型是 Person ，运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            //如何访问Teacher和Student的特有属性呢？ 使用类型判断+向下转型
            if (persons[i] instanceof Student){//判断persons[i]的运行类型是不是Student（instanceof判断运行类型是不是该对象以及改对象的子类）
                //第一种方法
//                ((Student)persons[i]).study();//把persons强转成Student
                //第二种方法
                Student student = (Student)persons[i];//向下转型
                student.study();
            }else if (persons[i] instanceof Teacher){
                ((Teacher) persons[i]).teach();
//                Teacher teacher = (Teacher) persons[i];
//                teacher.teach();
            }else if (persons[i] instanceof Person){//排除运行类型为Person的可能，即不做处理

            }else {
                System.out.println("你的类型有误，请自行检查！");
            }
        }
    }
}
