package LogicProgram;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = read.nextInt();
        int temp = 0, count = 0,  duplicate=n;

        while (n != 0) {
            temp = n % 10;
            int fact = 1;
            for (int i = 1; i <= temp; i++) {
                
                fact = fact * i;

            }
            count = count+ fact;
            n = n / 10;
        }

        if (duplicate==count) {
            System.out.println("Strongest Number");
        }else{
            System.out.println("Not a Strongest Number");
        }

        System.out.println(count);
    }
}
