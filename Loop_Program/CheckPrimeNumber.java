package Loop_Program;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = read.nextInt();
        int count=0;
        if(n>1){

        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("Is a Prime Number");
        }else{
            System.out.println("Composite Number");
        }
        }else{
            System.out.println("Neither Prime nor Composite");
        }

    }
}
