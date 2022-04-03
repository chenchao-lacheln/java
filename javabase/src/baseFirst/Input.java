package baseFirst;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        演示接收用户的收入
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = myScanner.next();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("请输入薪资：");
        double salary = myScanner.nextDouble();
        System.out.println("人的信息如下:");
        System.out.println("名字=" + name + "年龄= " + age + "薪水= " + salary);
    }
}
