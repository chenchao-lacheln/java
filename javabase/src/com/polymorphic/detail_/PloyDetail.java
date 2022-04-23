import com.polymorphic.detail_.Animal;
import com.polymorphic.detail_.Cat;

public class PloyDetail {
    public static void main(String[] args) {

        //向上转型：父类的引用指向了子类的对象
        //语法:父类类型 引用名 = new 子类类型()；
         Animal animal = new Cat();
        Object obj = new Cat();//Object是Animal的父类 也是cat的父类 可以进行引用

        //1.可以调用父类的所有成员（需遵守访问权限：比如private）
        //2.但不能调用子类的特有成员
        //3.因为在编译阶段，能调用哪些成员，是由编译类型来决定的
//        animal.catchMouse;错误
        //4.最终运行效果看子类（运行类型）的具体实现,即调用方法时，按照从子类（运行类型）开始查找方法，然后调用，规则和之前的方法调用规则一样
        animal.eat();//注意第3点，编译阶段是是编译类型决定的，但是运行的时候是由运行类型来决定的
        animal.run();
        animal.show();
        animal.sleep();
    }
}
