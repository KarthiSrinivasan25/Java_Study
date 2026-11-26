package Loop_Program;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value");
        int f1=0, f2=1, f3=0;
        int n = read.nextInt();
      for(int i = 1; i<=n; i++) {
            System.out.println(f1);
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }
}
