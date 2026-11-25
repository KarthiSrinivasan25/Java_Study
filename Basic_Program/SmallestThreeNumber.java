import java.util.Scanner;

public class SmallestThreeNumber {
     public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = read.nextInt();
        System.out.println("Enter B value");
        int b = read.nextInt();
        System.out.println("Enter C value");
        int c = read.nextInt();

        if((a<=b) && (a<=c)){
            System.out.println("A is Smallest Number");
        }else if((b<=a) && (b<=c)){
            System.out.println("B is Smallest Number");
        }else {
            System.out.println("C is Smallest Number");
        }
    }
}
