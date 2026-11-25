import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age = read.nextInt();

        if (age>=18) {
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");
        }
    }
}
