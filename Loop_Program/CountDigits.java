package Loop_Program;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Digits");
        int digits = read.nextInt();
        
        int count=0;
        while (digits!=0) {
            digits = digits/10;
            count++;
        }

        if (count==0) {
            count = 1;
        }
        System.out.println(count);
    }
}
