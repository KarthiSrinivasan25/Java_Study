package Loop_Program;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = read.nextInt();
        int duplicate = n;
        int n2 = n;
        int r = 0, count = 0, rem2;

        while (n != 0) {

            count++;
            n = n / 10;
        }

        while (n2 != 0) {
            rem2 = n2 % 10;
            int pow = 1;
            for (int i = 1; i <= count; i++) {
                pow = pow * rem2;

            }

            r = r + pow;

            n2 = n2 / 10;
        }

        if (duplicate == r) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

  

    }
}
