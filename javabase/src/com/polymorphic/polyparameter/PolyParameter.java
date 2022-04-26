package com.polymorphic.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",2900);
        Manager milan = new Manager("milan",8000,80000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);

        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }

    //实现获取任何员工对象的年工资，并在main方法中调用该方法
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定机制
    }

    //添加一个方法，testWork，如果是普通员工，则调用work方法，如果是经理，则调用manage方法
    public void testWork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();//向下转型
        }else if (e instanceof Manager){
            ((Manager) e).manage();
        }else if (e instanceof Employee){
            //不做处理
        }else {
            System.out.println("你的类型有误，请自行检查！");
        }
    }
}
