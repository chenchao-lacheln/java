package baseFirst;

public class TernaryOperatorDetail {
    public static void main(String[] args) {
        int a = 556;
        int b = 56;
        int c = 975;

        int max1 = a > b ? a : b ;
        int max2 = max1 > c ? max1 : c ;
        System.out.println("最大数为" + max2);
    }
}
