import java.util.Scanner;

public class LargestTwoNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = read.nextInt();
        System.out.println("Enter B value");
        int b = read.nextInt();

        

        if (a>b) {
            System.out.println("A is Largest Number");
        }else{
            System.out.println("B is Largest Number");
        }
    }
}
