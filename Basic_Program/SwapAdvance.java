import java.util.Scanner;

public class SwapAdvance {
    public static void main(String[] args) {
        Scanner read = new  Scanner(System.in);
        System.out.println("Enter A value");
        int a = read.nextInt();
        System.out.println("Enter B value");
        int b = read.nextInt();

        a = a - b;
        b = b + a;
        a = b - a;

        System.out.println("After Swap");
        System.out.println(a);
        System.out.println(b);
    }
}
