package Loop_Program;

import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = read.nextInt();
       

        for (int i = 1; i <= n; i++) {
             int duplicate = i;
        int n2 = i;
        int r = 0, count = 0, rem2;
            while (n2 != 0) {

                count++;
                n2 = n2 / 10;
            }

            n2 = i; 

            while (n2 != 0) {
                rem2 = n2 % 10;
                int pow = 1;
                for (int j = 1; j <= count; j++) {
                    pow = pow * rem2;

                }

                r = r + pow;

                n2 = n2 / 10;
                
            }
 if (duplicate == r) {
                System.out.println(duplicate);
            }
           

        }

    }
}
