package LogicProgram;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Base Value");
        int base = read.nextInt();

        System.out.println("Enter Power Value");
        int power = read.nextInt();
        // int base1 = base;

        // for (int i = 1; i < power; i++) {
        //     base = base * base1;
        // }

        // System.out.println(base);

        int result = 1;

        for(int i=1;i<=power;i++){
            result=result*base;
        }

        System.out.println(result);
    }
}
