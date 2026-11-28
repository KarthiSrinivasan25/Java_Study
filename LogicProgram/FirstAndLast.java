package LogicProgram;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value");
        int n = read.nextInt();
        int n2=n;
        int last=0;
        int first=0;
 last = n%10;
        while (n!=0) {
            first=n%10; 

            n = n/10;
           
        }

       
           
       

        System.out.println(first);
        System.out.println(last);
    }
}
