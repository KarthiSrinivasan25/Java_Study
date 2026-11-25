import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = read.nextInt();
        System.out.println("Enter B value");
        int b = read.nextInt();

        int temp;

       temp = a;
       a = b;
       b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
