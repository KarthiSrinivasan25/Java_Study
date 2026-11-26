package Loop_Program;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value");
        int n = read.nextInt();
        int sum =0;
        for(int i = 1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum of N: "+sum);
    }
}
