package Loop_Program;
import java.util.*;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = read.nextInt();
        int product = 1, temp = 0;
        while (n!=0) {
            temp = n%10;
            n = n/10;
            product = temp*product;
        }
        System.out.println(product);
    }
}
