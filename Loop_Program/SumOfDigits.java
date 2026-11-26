package Loop_Program;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = read.nextInt();
        int sum = 0, temp = 0;
        while (n!=0) {
            temp = n%10;
            n = n/10;
            sum = temp+sum;
        }
        System.out.println(sum);
    }
}
