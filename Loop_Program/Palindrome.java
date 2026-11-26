package Loop_Program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = read.nextInt();
        int duplicate = n;
        int rem =0, rev = 0;
        while (n!=0) {
            rem = n%10;
            rev = rem + rev * 10;
            n = n/10;
        }

        if (duplicate == rev) {
            System.out.println(rev+ " is palindrome");
        }else{
            System.out.println(rev+" Not a palindrome");
        }

    }
}
