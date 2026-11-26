package Loop_Program;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = read.nextInt();
        int rem =0, rev = 0;
        while (n!=0) {
            rem = n%10;
            rev = rem + rev * 10;
            n = n/10;
        }

        System.out.println(rev);
    }
}
