package Loop_Program;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int n1 = read.nextInt();
        System.out.println("Enter Number 2");
        int n2 = read.nextInt();

        int min = Math.min(n1, n2);
        int gcd=0, lcm=0;

        for(int i=1; i<=min;i++){
            if (n1%i==0 && n2%i==0) {
                gcd=i;
            }
        }

        lcm=(n1*n2)/gcd;

        System.out.println("LCM: "+ lcm);

    }
}
