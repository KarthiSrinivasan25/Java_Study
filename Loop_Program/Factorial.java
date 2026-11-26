package Loop_Program;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter N Value");
        int n = read.nextInt();

        for(int i=1; i<=n; i++){
            fact = fact*i;
        }

        System.out.println("Factorial:" + fact);

    }
}
